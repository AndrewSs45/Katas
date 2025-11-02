# Git Conventions Java.

Los git conventions son un conjunto de reglas las cuales van encaminadas por un equipo de desarrollo, para generar un estandar de cómo se crean ciertas acciones o cómo nosotros siendo desarroladores podemos implementar o editar ciertos funcionamientos, esto en si se hace con un markdown, el cuál es el reconocido README.MD.

De hecho la forma más popular de estandarizar los mensajes de los commits es mejor conocida como conventional commits,  su estructura es simple :

## $$\text{<tipo> [(\text{ambito opcional})]: <descripción>}$$

Donde el tipo indica la naturaleza del cambio, este es obligatorio colocarlo, un ejemplo sería colocar *Feat:* Lo cuál corresponde a una nueva funcionalidad. *Fix:* Lo cuál se centra en la correción de bugs, etc. . . 

En si no hay conventions los cuales sean específicos para java ya que estos son universales , pero si hay archivos los cuales se deben ignorar, como los archivos generados por IDES como .idea o .project o también los directorios de salida  de compilación.