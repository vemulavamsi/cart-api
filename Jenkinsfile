pipeline {
    agent any
    stages {
        stage('checkout'){
            steps{
                git branch: 'main', credentialsId: 'github', url: 'https://github.com/sanjeev0181/java-web-app-dockers.git'
            }
        }
        stage('Build Maven'){
            steps {
                sh 'mvn clean'
            }
        }
        stage("build & SonarQube analysis") {
            steps {
                sh 'mvn clean sonar:sonar'
            
            }
        }
        stage('Build Docker image'){
            steps {
                sh 'docker build -t sanjeev0181/java-web-app-docker:1.0.0   -f   /opt/Dockerfile .'
            }
        }
        stage('push docker image'){
			steps {
				withCredentials([string(credentialsId: 'Doker-pwd', variable: 'DockerHubPwd')]) {
				sh "docker login -u sanjeev0181 -p ${DockerHubPwd}"
				}
				sh   'docker push  sanjeev0181/java-web-app-docker:1.0.0'
			}
		}
		stage('Run Container on jenkins'){
		    steps {
		        sh 'docker run  -p 9000:8080 -d --name java-web-app-docker sanjeev0181/java-web-app-docker:1.0.0'
		    }
		}
    }
}