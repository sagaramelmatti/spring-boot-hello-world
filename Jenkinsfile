pipeline {
  agent any
  stages {
    stage('stage1') {
      steps {
        echo 'Spring Boot Hello $BUILD_NUMBER of Job $DEMO'
      }
    }

  }
  environment {
    DEMO = '1'
  }
}