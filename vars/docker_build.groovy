def call(Map config = [:]) {
    def imageName = config.imageName ?: 'ProjectName'
    def imageTag = config.imageTag ?: 'latest'
    def dockerfile = config.dockerfile ?: 'Dockerfile'
    def context = config.context ?: '.'

def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker build tag "${DockerHubUser}"/"${ProjectName}":"${ImageTag}" -f "${dockerfile}" "${context}" "
}
