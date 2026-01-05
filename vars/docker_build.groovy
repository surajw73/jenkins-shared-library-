def call(Map config = [:]) {
    def imageName = config.imageName ?: error('enter image name')
    def imageTag = config.imageTag ?: 'latest'
    def  dockerHubUser = config.dockerHubUser ?: error('enter docker hub user namne' )
    def dockerfile = config.dockerfile ?: 'Dockerfile'
    def context = config.context ?: '.'
   
  sh "docker build tag "${dockerHubUser}"/"${imageName}":"${imageTag}" -f "${dockerfile}" "${context}" "
}
