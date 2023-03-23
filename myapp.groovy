pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
               checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/pmurali831/maven-1.git']]])
            }
        }
        stage('list'){
            steps {
                sshagent(['62b3993d-f243-4b41-837e-823916bc76c2']) {
                 sh 'df -h'
}
            }
        }
    }
}
