pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'
        jdk 'jdk11'
    }
    stages {
        stage("test") {
            steps {
                script {
                    sh '''
                        mvn test
                    '''
                }
            }
        }
        stage("build") {
            steps {
                script {
                    sh '''
                        mvn package -DskipTests
                        docker build --memory=512m -t incident_dashboard .
                    '''
                }
            }
        }
    }
}