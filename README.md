# Springboot-project docker image build:

### 1.project crated,build,run on local port
### 2.open terminal from IDE or the project location 
### 3.mvn spring-boot:build-image
### 4.successful image creation- check docker image in another docker CLI:> docker image ls
### 5.docker run --tty --publish 8080:8080 springboot-docker-image:0.0.1-SNAPSHOT<--image name

# Login to Docker ECR from AWS CLI(version>2.54):

### Step 1:
### C:\Users\Priyo>aws configure
### AWS Access Key ID [None]: xxxxxxxxxxxxxxxxxx
### AWS Secret Access Key [None]: xxxxxxxxxxxxxxxxxx
### Default region name [XXXXXXXXXXX]:
### Default output format [XXXXXX]:

### Step 2:
### C:\Users\Priyo>aws ecr get-login-password --region $default-region-name | docker login --username AWS --password-stdin $ECR-Repository-URL
### Login Succeeded

### Step 3:
### docker tag  $image-name:tage-name  $ECR-Repository-URL

### step 4:
### docker push $ECR-Repository-URL

### step 5:
### check the AWS console Image is avialble;

