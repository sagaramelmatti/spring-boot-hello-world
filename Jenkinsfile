pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'
                sh 'mvn clean install'
            }
        }
        stage('Parallel Tests') {
            parallel {
                stage('Unit Tests') {
                    steps {
                        echo 'Running Unit Tests...'
                        sh 'mvn test -Dtest=UnitTests'
                    }
                }
                stage('Integration Tests') {
                    steps {
                        echo 'Running Integration Tests...'
                        sh 'mvn test -Dtest=IntegrationTests'
                    }
                }
                stage('Static Code Analysis') {
                    steps {
                        echo 'Running Static Code Analysis...'
                        sh 'mvn checkstyle:check'
                    }
                }
            }
        }
    }
}
