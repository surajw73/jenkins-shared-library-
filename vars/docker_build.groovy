def call(String imageName, String imageTag, String dockerHubUser) {
    sh "docker build tag "${dockerHubUser}"/"${imageName}":"${imageTag}"."
}
