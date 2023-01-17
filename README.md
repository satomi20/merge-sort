Версия Java 17

Система сборки Maven 4.0.0

### Программа для сортировки слиянием нескольких файлов и запись их в отдельный файл

Данные во входных файлах могу быть не отсортированы

Порядок запуска программы:
1) Перейти из командной строки или терминала в корневую папку с программой

    У меня это было так: `cd C:\Users\User\Desktop\merge-sorting`
2) Скомпилировать классы, перейдя в основную папку и выполнив следующую команду: "`javac -d bin src/main/java/com/daniel/*java`"
3) Для запуска программы, перейдите в главную папку и выполните следующую команду: "`java -cp bin com.daniel.Main`"

Для работы с программой указываются данные через пробел

**1 арг.** -i(-s) - входные данные для сортировки числа(строки)

**2 арг.** -a(-d) - тип сортировки по возрастанию(по убыванию)

**3 арг.** имя выходного файл (обязательный параметр)

**4 арг.** имя входного файла (не менее одного)

---**Все ошибки обработаны**---

Если один из файлов не читается, то программа выводит сообщение об ошибке и переходит к следующему файлу



