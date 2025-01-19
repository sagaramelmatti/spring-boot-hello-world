pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Running test cases...'
                sh 'mvn test'
            }
        }
    }
}
