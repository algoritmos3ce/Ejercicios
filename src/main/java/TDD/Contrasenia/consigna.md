# Contraseña

Cree una función que se pueda utilizar como validador para el campo de contraseña de un formulario de registro de usuario. La función de validación toma un string como entrada y devuelve un resultado de validación. El resultado de validación debe contener un booleano que indique si la contraseña es válida o no, y también un campo con los posibles errores de validación.

Requisitos

La contraseña debe tener al menos 8 caracteres. Si no se cumple, se debe devolver el siguiente mensaje de error: “La contraseña debe tener al menos 8 caracteres”.

La contraseña debe contener al menos 2 números. Si no se cumple, se debe devolver el siguiente mensaje de error: “La contraseña debe contener al menos 2 números”.

La función de validación debe manejar múltiples errores de validación.

Por ejemplo, “somepassword” debería tener un mensaje de error: “La contraseña debe tener al menos 8 caracteres\nLa contraseña debe contener al menos 2 números”.

La contraseña debe contener al menos una letra mayúscula. Si no se cumple, se debe devolver el siguiente mensaje de error: “La contraseña debe contener al menos una letra mayúscula”.

La contraseña debe contener al menos un carácter especial. Si no se cumple, se debe devolver el siguiente mensaje de error: “La contraseña debe contener al menos un carácter especial”.