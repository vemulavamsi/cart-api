pipeline {
    agent any
    stages {
        stage('checkout'){
            steps{
                git branch: 'main', credentialsId: 'Git', url: 'https://github.com/vemulavamsi/cart-api.git'
            }
        }
        stage('Build Maven'){
            steps {
                sh 'mvn spring-boot:run'
            }
        }
         stage('Deploy') {
            steps {
                // Deploy the Spring Boot application (e.g., copy JAR file to a server)
                script {
                    sh 'cp target/ShoppingCart.jar user@your-server:/path/to/deployment/'
                }
            }
        }
    }

    post {
        success {
            echo 'Deployment successful'
        }
        failure {
            echo 'Deployment failed'
        }
    }
}