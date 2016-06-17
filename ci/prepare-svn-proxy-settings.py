#
# Copyright (C) 2016 Lukas Bulwahn, BMW Car IT GmbH
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
#

import string
import sys
import re
import os

file_name = sys.argv[1]
expr = r'^http://(?P<user>\w*):(?P<pass>\w*)@(?P<host>[\w.]*):(?P<port>\d*)/'
file_template = string.Template('''[global]
http-proxy-host = $host
http-proxy-port = $port
http-proxy-username = $user
http-proxy-password = $pass
''')

http_proxy = os.environ.get("http_proxy")
if http_proxy:
    m = re.match(expr, http_proxy)
    with open(file_name, 'w') as output_file:
        output_file.write(file_template.substitute(m.groupdict()))
