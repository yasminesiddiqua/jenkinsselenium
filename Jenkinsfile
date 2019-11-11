pipeline {
    agent {
         docker {
             image 'maven:3-alpine'
             args '-v /root/.m2:/root/.m2'
         }
     }
    stages {
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        
        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
        
        stage('Third') {
            steps {
                echo 'third stage'
            }
        }
        
    }
}
