def call(String task = 'clean install') {
    echo "--- Début du Build Maven : ${task} ---"
    sh "mvn ${task} -DskipTests"
}
