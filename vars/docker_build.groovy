def call(String imageName, String imageTag, String dockerHubUser, String dockerfile, String context) {
   
   
  sh "docker build tag "${dockerHubUser}"/"${imageName}":"${imageTag}" -f "${dockerfile}" "${context}" "
}
