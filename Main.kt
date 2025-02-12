
fun main(){

    val listaNotificables = mutableListOf<Notificable>()
    listaNotificables.add(MensajeTexto())
    listaNotificables.add(NotificacionPush("correo"))
    listaNotificables.add(CorreoElectronico("maicrahfoverer@gmail.com"))

    for(notificacion in listaNotificables){
        notificacion.enviarNotificacion()
    }
}