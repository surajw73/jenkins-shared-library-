def call(Map config = [:]) {
    def imageName = config.imageName ?: error('enter image name')
    def imageTag = config.imageTag ?: 'latest'
    def dockerfile = config.dockerfile ?: 'Dockerfile'
    def context = config.context ?: '.'
    def  DockerHubUser = config.DockerHubUser ?: error('enter docker hub user namne' )
  sh "docker build tag "${DockerHubUser}"/"${imageName}":"${imageTag}" -f "${dockerfile}" "${context}" "
}
