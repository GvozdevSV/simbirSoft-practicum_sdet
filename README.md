# Тестовое задание

1. На языке программирования Java (рекомендуется использовать 11 или 17) создать проект 
UI-автотестов по тест-кейсам описанным ниже.
2. В проекте использовать: 
 * Selenium Webdriver (желательно использовать браузер Chrome).
 * При поиске элементов на странице использовать как минимум по одному селектору из 
 перечисленных: css, xpath, id.
 * Один из тестовых фреймворков: TestNG, JUnit 4/5.
 * Один из сборщиков: Maven, Gradle.
3. Результаты оформить в виде проекта на GitHub.
4. В проекте желательно использовать паттерн проектирования Page Object Model.
5. Приветствуется, но не обязательно, реализация формирования отчетов о пройденных 
тестах через Allure.

## Кейс. Заполнение формы регистрации
### Предусловие:
1. Открыть браузер
2. Перейти на страницу входа: https://demoqa.com/automation-practice-form
### Шаги:
1. Заполнить поле First Name произвольной строкой
2. Заполнить поле Last Name произвольной строкой
3. Заполнить поле Email строкой формата name@example.com
4. Выбрать любое значение в Gender с помощью переключателя
5. Заполнить поле Mobile произвольными 10 цифрами
6. Заполнить поле Date of birth произвольной датой с помощью всплывающего календаря
7. Заполнить поле Subjects произвольной строкой
8. Загрузить любое изображение в поле Picture
9. Заполнить поле Current Address произвольной строкой
10. Выбрать любое значение в Select State с помощью выпадающего списка
11. Выбрать любое значение в Select City с помощью выпадающего списка
12. Нажать кнопку Submit
### Ожидаемый результат:
1. Появилось всплывающее окно с заголовком Thanks for submitting the form
2. В таблице на окне отображаются введенные ранее значения

### Используемый стек технологий
* Java 11
* Selenium Webdriver (chromedriver и msedgedriver на выбор)
* TestNG
* Maven
* Allure
* Для тестирования использовался браузер Chrome v.116.0.5845.111 и Edge 116.0.1938.54
