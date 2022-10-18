### Clonar
    git clone https://github.com/elias-gill-UNA/grupoLP3
    
### Cambiar rama
    git checkout <rama>

### Crear rama 
    git branch <rama>

### Commit
    git commit -m "<un mensaje>"

### Push
* Primera vez
    git push -u origin <rama>
* Despues solo
    git push

### Pull de master a sus ramas
    ```python
        # estando en sus ramas
        git pull origin master --rebase
    ```
 Resolver los conflictos de merge si ocurren.
