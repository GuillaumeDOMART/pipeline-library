def call(String status) {
    echo "Envoi de la notification : ${status}"
    // Ici, vous pourriez utiliser le plugin Slack
    // slackSend color: (status == 'SUCCESS' ? 'good' : 'danger'), message: "Build ${status}: ${env.JOB_NAME}"
}
