pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'
        jdk 'jdk16'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage("test") {
            steps {
                script {
                    sh '''
                        mvn test
                    '''
                }
            }
        }
    }
}