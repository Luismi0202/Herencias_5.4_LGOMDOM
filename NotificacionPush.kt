class NotificacionPush(
    val aplicacion:String
):Notificable {

    override fun enviarNotificacion() {
        println("¡Tienes un mensaje en $aplicacion!")
    }
}