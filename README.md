# Automation Tests Project

Этот проект содержит автоматизированные тесты для веб- и мобильного приложения.

## Структура проекта

- `src/test/java/pages/web/` - Page Object классы для веб-тестов
- `src/test/java/pages/mobile/` - Page Object классы для мобильных тестов
- `src/test/java/tests/web/` - Веб-тесты
- `src/test/java/tests/mobile/` - Мобильные тесты
- `src/test/java/utils/` - Утилиты для драйверов

## Требования

- JDK 11+
- Maven 3.6+
- Chrome браузер (для веб-тестов)
- Android эмулятор или устройство с установленным Wikipedia APK (версия 2.7+)
- Appium Server 2.0+ (локальный)

## Установка

1. Клонируйте репозиторий.
2. Установите зависимости: `mvn clean install`

## Настройка окружения

### Для веб-тестов
- Убедитесь, что Chrome установлен.
- WebDriverManager автоматически загрузит chromedriver.

### Для мобильных тестов
1. Установите Appium Server: `npm install -g appium`
2. Запустите Appium: `appium --address 127.0.0.1 --port 4723`
3. Настройте Android эмулятор или подключите устройство.
4. Установите APK Wikipedia (org.wikipedia) на устройство.
5. Убедитесь, что устройство доступно: `adb devices`

## Запуск тестов

### Веб-тесты
```bash
mvn test -DsuiteXmlFile=src/test/resources/testng-web.xml
```

### Мобильные тесты
```bash
mvn test -DsuiteXmlFile=src/test/resources/testng-mobile.xml
```

### Все тесты
```bash
mvn test
```

## Сценарии тестирования

### Веб-тесты (the-internet.herokuapp.com)
- Загрузка главной страницы и проверка заголовка
- Аутентификация формы (успешный логин)
- Работа с чекбоксами (включение/выключение)
- Работа с дропдауном (выбор опции)

### Мобильные тесты (Wikipedia Android)
- Загрузка главного экрана и проверка поля поиска
- Поиск статьи по ключевому слову "Java" и проверка заголовка
- Прокрутка в статье и проверка наличия изображения

## Конфигурация

Тесты используют следующие настройки:
- Веб: Chrome в headless режиме
- Мобильные: Android эмулятор (deviceName: emulator-5554), appPackage: org.wikipedia

## Отчеты

TestNG генерирует отчеты в `target/surefire-reports/`

## Возможные проблемы

- Для мобильных тестов убедитесь, что Appium Server запущен и устройство подключено
- Проверьте, что APK Wikipedia установлен и соответствует package name
- Для веб-тестов интернет-соединение обязательно для доступа к сайту