pipeline {
    agent any
    tools {
        maven 'Maven3' // đúng tên bạn đặt ở bước 2
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/dungkon123123/java-demo', branch: 'master'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
    post {
        always {
            echo 'Hoàn thành pipeline'
        }
        failure {
            echo 'Build lỗi'
        }
    }
}
