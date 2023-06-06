pipeline {
  agent any
  stages {
    stage('CheckoutGit') {
      steps {
        git(branch: 'main', url: 'https://github.com/elestopadov/jenkins-example-app.git')
      }
    }

    stage('build') {
      steps {
        echo 'hello world'
      }
    }

    stage('Deploy') {
      parallel {
        stage('Deploy dev1') {
          steps {
            sleep 10
            echo 'dev1'
          }
        }

        stage('Deploy dev2') {
          steps {
            sleep 10
            echo 'dev2'
          }
        }

      }
    }

    stage('Test') {
      steps {
        echo 'test'
      }
    }

  }
}