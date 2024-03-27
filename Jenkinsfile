pipeline {
    agent any
    
         
        stage('Build') {
            steps {
                // Use Maven to build the application
                echo 'Building...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
    }
    
    post {
        success {
            // Notification for successful build
            echo 'Build successful! Notifying team...'
            // Send notification, for example via email, Slack, etc.
        }
        failure {
            // Notification for failed build
            echo 'Build failed! Notifying team...'
            // Send notification, for example via email, Slack, etc.
        }
    }
}
