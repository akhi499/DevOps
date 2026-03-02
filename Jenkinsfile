pipeline {
    agent any
    stages {
        stage('Build Docker Image') {
            steps {
                bat 'docker build -t myapp .' [cite: 150, 151, 152]
            }
        }
        stage('Run Container') {
            steps {
                bat 'docker run -d -p 8081:80 myapp' [cite: 156, 157, 158]
            }
        }
    }
}
