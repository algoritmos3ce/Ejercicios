En este ejemplo, la interfaz Trabajador tiene varios métodos, pero no todos los trabajadores necesitan implementar todos los métodos. Esto viola el Principio de Segregación de Interfaces (ISP) porque se está obligando a las clases que implementan la interfaz a implementar métodos que no son relevantes para ellas.

Solución: Dividir la interfaz Trabajador en interfaces más pequeñas y específicas, por ejemplo, una interfaz Desarrollador con los métodos trabajar() y reportarProgreso() y una interfaz Empleado con los métodos tomarDescanso() y asistirReuniones().

