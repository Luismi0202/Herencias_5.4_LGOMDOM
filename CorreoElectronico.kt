class CorreoElectronico(
    val correo: String
):Notificable {
    override fun enviarNotificacion() {
        println("CORREO RECIBIDO EN $correo")
    }
}