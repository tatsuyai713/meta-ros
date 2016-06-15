#!/bin/sh

# Access shared volumes as non root user
#
# Usage: docker run -e DEV_UID=$(id -u)  ...
# Source: http://chapeau.freevariable.com/2014/08/docker-uid.html

USER=hsp-dev

export DEV_UID=${DEV_UID:=1000}
export DEV_GID=${DEV_GID:=1002}

useradd -u $DEV_UID -M $USER -G sudo
echo "Changin password to hsp-dev"
echo "hsp-dev:hsp-dev" | chpasswd

mkdir -p /home/$USER
cp -a /etc/skel/. /home/$USER
chown -R $USER:$USER /home/$USER

if [ $# -eq 0 ]; then
	# no commands supplied
	export HOME=/home/$USER
	exec gosu $DEV_UID:$DEV_GID /bin/bash
else
	# commands supplied
	export HOME=/home/$USER
	exec gosu $USER /bin/bash -c "source $HOME/.bashrc; $*"
fi

