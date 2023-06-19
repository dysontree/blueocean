pipeline {
agent any

options {
  timestamps()
  timeout(10)
  buildDiscarder logRotator(daysToKeepStr: '7',
                            numToKeepStr: '14')
    
}

stages {
    stage('checkout') {
        steps {
            git branch: 'main', url: 'https://github.com/dysontree/blueocean.git'
                }
            }

stage('load code print') {
        steps {
            script {
                def code = load 'change.groovy'
                code.change()
            }
                
            }
            }


stage('load code scm') {
        steps {
            script {
                def git_chng = load 'git.groovy'
                git_chng.scm()
            }
                
            }
            }
  }
}
