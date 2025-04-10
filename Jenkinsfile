node {
    try {
        stage('Checkout') {
            // Lấy mã nguồn từ repository
            git url: 'https://github.com/dungkon123123/java-demo', branch: 'master'
        }
        stage('Build') {
            // Xây dựng dự án
            sh 'mvn clean install'
        }
        stage('Test') {
            // Chạy test
            sh 'mvn test'
        }
    } catch (err) {
        echo "Build lỗi: ${err}"
        // Dừng pipeline nếu gặp lỗi
        currentBuild.result = 'FAILURE'
        throw err
    } finally {
        // Hành động báo cáo chung
        echo 'Hoàn thành pipeline'
    }
}