This document describes how to setup and deploy the jenkins CI jobs
for testing meta-ros.

## Setup

Create a jenkins-jobs.conf file with the following information:

```
[jenkins]
user=<user that is allowed modify the build job>
password=<user's password>
url=<url to the jenkins server>

[job_builder]
ignore_cache=True
```

## Update CI job

Update jenkins jobs with:

```
jenkins-jobs --conf jenkins-jobs.conf update meta-ros.yaml
```

