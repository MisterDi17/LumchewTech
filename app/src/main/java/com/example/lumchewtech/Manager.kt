package com.example.lumchewtech

class Manager {
    private val directions = listOf(
        Direction("09.02.07", "Информационные системы и программирование",
            "квалификация - программист\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 3года 10месяцев/ 2 года 10 месяцев\n" +
                    "форма обучения: очная\n" +
                    "Календарный учебный график\n" +
                    "Учебный план по специальности\n" +
                    "Аннотации рабочих программ специальности\n" +
                    "ППСCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "Рабочая программа воспитания"),
        Direction("13.02.02", "Теплоснабжение и теплотехническое оборудование",
            "квалификация - техник\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 3года 10месяцев / 2 года 10 месяцев\n" +
                    "форма обучения: очная\n" +
                    "Календарный учебный график\n" +
                    "Учебный план по специальности\n" +
                    "Аннотации рабочих программ специальности\n" +
                    "ППСCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "Рабочая программа воспитания"),
        Direction("15.02.12", "Монтаж, техническое обслуживание и ремонт промышленного оборудования (по отраслям)",
            "квалификация - техник\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 3года 10месяцев / 2 года 10 месяцев\n" +
                    "форма обучения: очная\n" +
                    "Календарный  учебный график \n" +
                    "Учебный план по специальности 15.02.12 - \"Монтаж, техническое обслуживание и ремонт промышленного оборудования (по отраслям)\"\n" +
                    "Аннотации рабочих программ специальности\n" +
                    "ППCCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "Рабочая программа воспитания"),
        Direction("15.02.14", "Оснащение средствами автоматизации технологических процессов и производств (по отраслям)",
            "квалификация - техник\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 3года 10месяцев \n" +
                    "форма обучения: очная\n" +
                    "Календарный учебный график\n" +
                    "Учебный план по специальности\n" +
                    "ППСCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "ФОС\n" +
                    "Рабочая программа воспитания"),
        Direction("15.02.17", "Монтаж, техническое обслуживание, эксплуатация и ремонт промышленного оборудования (по отраслям)",
            "квалификация - техник-механик\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 3года 10месяцев\n" +
                    "форма обучения: очная\n" +
                    "Календарный  учебный график \n" +
                    "Учебный план по специальности\n" +
                    "ППCCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "ФОС\n" +
                    "Рабочая программа воспитания"),
        Direction("18.02.09", "Переработка нефти и газа",
            "квалификация - техник\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 3года 10месяцев / 2 года 10 месяцев\n" +
                    "форма обучения: очная, заочная\n" +
                    "Календарный учебный график\n" +
                    "Календарный учебный график (заочное)\n" +
                    "Учебный план по специальности\n" +
                    "Учебный план по специальности (заочное)\n" +
                    "Аннотации рабочих программ специальности\n" +
                    "Аннотации рабочих программ специальности (заочное)\n" +
                    "ППСCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "Рабочие программы(заочное)\n" +
                    "Рабочая программа воспитания"),
        Direction("18.02.12", "Технология аналитического контроля химических соединений",
            "квалификация - техник\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 3года 10месяцев / 2 года 10 месяцев\n" +
                    "форма обучения: очная\n" +
                    "Календарный учебный график \n" +
                    "Учебный план по специальности\n" +
                    "Аннотации рабочих программ специальности\n" +
                    "ППСCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "Рабочая программа воспитания"),
        Direction("20.02.01", "Экологическая безопасность природных комплексов",
            "квалификация - техник\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 3года 10месяцев / 2 года 10 месяцев\n" +
                    "форма обучения: очная\n" +
                    "Календарный учебный график\n" +
                    "Учебный план по специальности\n" +
                    "Аннотации рабочих программ специальности\n" +
                    "ППСCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "Рабочая программа воспитания"),
        Direction("20.02.04", "Пожарная безопасность",
            "квалификация - техник\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 3года 10месяцев / 2 года 10 месяцев\n" +
                    "форма обучения: очная\n" +
                    "Перечень дисциплин (модулей), практик\n" +
                    "Календарный учебный график\n" +
                    "Учебный план по специальности\n" +
                    "Аннотации рабочих программ специальности\n" +
                    "ППСCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "Рабочая программа воспитания"),
        Direction("20.02.05", "Организация оперативного (экстренного) реагирования в чрезвычайных ситуациях",
            "квалификация - специалист по приему и обработке экстренных вызовов\n" +
                    "уровень образования: среднее профессиональное\n" +
                    "срок обучения 3года 10месяцев / 2 года 10 месяцев\n" +
                    "форма обучения: очная\n" +
                    "Календарный учебный график\n" +
                    "Учебный план по специальности\n" +
                    "Аннотации рабочих программ специальности\n" +
                    "ППСCЗ по специальности\n" +
                    "ФОС\n" +
                    "Рабочие программы\n" +
                    "Рабочая программа воспитания"),
        Direction("38.02.01", "Экономика и бухгалтерский учет (по отраслям)",
            "квалификация - бухгалтер\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 2года 10месяцев / 1 год 10 месяцев\n" +
                    "форма обучения: очная, заочная\n" +
                    "Перечень дисциплин (модулей), практик\n" +
                    "Календарный учебный график\n" +
                    "Учебный план по специальности\n" +
                    "Аннотации рабочих программ специальности\n" +
                    "ППСCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "Рабочая программа воспитания"),
        Direction("38.02.07", "Банковское дело",
            "квалификация - специалист банковского дела\n" +
                    "уровень образования:среднее профессиональное\n" +
                    "срок обучения 2года 10месяцев / 1 год 10 месяцев\n" +
                    "форма обучения: очная, заочная\n" +
                    "Перечень дисциплин (модулей), практик\n" +
                    "Календарный учебный график\n" +
                    "Учебный план по специальности\n" +
                    "Аннотации рабочих программ специальности\n" +
                    "ППСCЗ по специальности\n" +
                    "Рабочие программы\n" +
                    "Рабочая программа воспитания")
    )

    private val teachers = listOf(
        Workers(0, "Москвина Ольга Константиновна",
            "Высшее, ОГПИ им. Т.Г. Шевченко, 1997 г.",
            "Учитель русского языка и литературы по специальности «Филология»",
            "Методист, преподаватель", "Русский язык, литература",
            "Высшая категория «Методист», приказ от 02.06.2022 №01-21/724 Высшая категория «Преподаватель», приказ от 02.06.2022 №01-21/724",
            "Повышение квалификации:\n " +
                    "Повышение квалификации преподавателей СПО в соответствии с ФГОС СОО в  предметной области «Русский язык и литература», ФГБОУ ВО «Оренбургский государственный педагогический университет»,   2020 г.; " +
                    "«Цифровые технологии в образовании», ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2021г.; " +
                    "«Методика преподавания общеобразовательной дисциплины «Литература» с учетом профессиональной направленности основных образовательных программ СПО», ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2021 г. " +
                    "«Методика преподавания общеобразовательной дисциплины «Русский язык» с учетом профессиональной направленности основных образовательных программ СПО», ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2021 г. " +
                    "\"Разговоры о важном: система работы классного руководителя (куратора)\", ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2022 г.;" +
                    "«Методика преподавания общеобразовательной дисциплины «Родной язык» с учетом профессиональной направленности основных образовательных программ СПО» (ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2022 г.; " +
                    "«Методика преподавания общеобразовательной дисциплины «Родная литература» с учетом профессиональной направленности основных образовательных программ СПО» (ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2022 г. " +
                    "Инновационные формы работы в профессиональном образовании, Ассоциация образовательных организаций «Профессионал», г. Самара, 2022 г.",
            25,25
        ),
        Workers(1,"Леднева Наталья Геннадьевна",
            "Высшее, ФГБОУ ВПО «ОГПУ», 2013г.",
            "Физическая культура",
            "Руководитель физического воспитания, преподаватель","Физическая культура",
            "Высшая категория «Руководитель физического воспитания», приказ от 11.10.2019 №01-21/1984",
            "Повышение квалификации:\n" +
                    "Цифровые технологии для трансформации ПОО, ФГБОУ ВО «Оренбургский государственный педагогический университет», 2020 г.;" +
                    " «Современные фитнес-технологии и инновационные подходы в преподавании физической культуры в общеобразовательных и профессиональных образовательных организациях», 72 часа, ФГБУ «Федеральный центр подготовки спортивного резерва», 2021 г.;\n" +
                    "«Методика преподавания общеобразовательной дисциплины «Физическая культура» учетом профессиональной направленности основных образовательных программ среднего профессионального образования», 2021 г." +
                    "\"Разговоры о важном: система работы классного руководителя (куратора)\", ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2022 г.",
            31,31
        ),
        Workers(2,"Вавилина Ольга Анатольевна",
            "Высшее, ОГПИ им. Т.Г. Шевченко, 1987 г.",
            "Квалификация и звание учителя средней школы по специальности «Математика и физика»",
            "Преподаватель-организатор основ безопасности жизнедеятельности, преподаватель",
            "Основы безопасности жизнедеятельности,Безопасность жизнедеятельности, Физика,ОП 01 Теоретические основы теплотехники и гидравлики",
            "Высшая категория «Преподаватель- организатор основ безопасности жизнедеятельности» приказ от 23.12.2020 №01-21/1762 Высшая категория «Преподаватель», приказ от 27.12.2019 №01-21/2480",
            "ФГБОУ ВПО «Оренбургский государственный университет» по программе «Безопасность жизнедеятельности», 510 ч., 2014 г." +
                    "Повышение квалификации:\n" +
                    "\"Методика преподавания общеобразовательной дисциплины \"Астрономия\" с учетом профессиональной направленности основных образовательных программ СПО\", ФГАОУ ДПО \"Академия Минпросвещения России\", 2021 г.;" +
                    "«Методика преподавания общеобразовательной дисциплины «Основы безопасности жизнедеятельности» с учетом профессиональной направленности основных образовательных программ СПО» (ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2021 г.;" +
                    "\"Разговоры о важном: система работы классного руководителя (куратора)\", ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2022 г.;" +
                    "«Методика преподавания общеобразовательной дисциплины «Физика» с учетом профессиональной направленности основных образовательных программ СПО» (ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2022 г.;" +
                    "«Методика преподавания общеобразовательной дисциплины «Естествознание» с учетом профессиональной направленности основных образовательных программ СПО» (ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2022г.;" +
                    "Современные подходы  и технологии в системе организации патриотического воспитания учащихся образовательных организаций, ГАУ Оренбургской области «Региональное агентство молодежных программ и проектов», 2023 г." +
                    "Содержание требований ФОП ООО и СОО: организация образовательного процесса обучающихся по обновленным ФГОС на уроках физики, ООО «Высшая школа делового администрирования», 2023 г." +
                    "Обновленный ФГОС СОО: образовательные траектории старшеклассников и студентов СПО, АО «Издательство «Просвещение», 2023 г.",
            36,36
        ),
        Workers(3,"Куандыкова Зауреш Дусмановна",
            "Высшее, ФГБОУ ВПО «ОГУ», 2014 г.",
            "Социальный педагог по специальности 050711 Социальная педагогика",
            "Социальный педагог, преподаватель", "География",
            "Первая категория «Социальный педагог», приказ от 06.02.2023 №01-21/152",
            "Повышение квалификации:\n" +
                    "Воспитательная деятельность в системе СПО: профилактика девиантного, суицидального поведения, безопасного поведения студентов в сети Интернет», ФГАОУ ДПО «Академия Минпросвещения России», 2021 г." +
                    "\"Разговоры о важном: система работы классного руководителя (куратора)\", ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2022 г.;" +
                    "Организация воспитательной работы в образовательных организациях системы  СПО, ФГБОУ «Всероссийский детский центр «Смена», 2023 г.",
            4,2
        ),
        Workers(4, "Горшенина Кристина Владимировна",
            "Высшее, ФГБОУ ВПО «ОГУ», 2015г.", "Бакалавр, диплом с отличием по направлению подготовки 44.03.02 Психолого-педагогическое образование",
            "Педагог-психолог (отпуск по уходу за ребенком до 3 лет)", "-",
            "Высшая категория «Педагог-психолог», приказ от 11.12.2019 №01-21/2392",
            "Повышение квалификации: \n" +
                    "Воспитательная деятельность в системе СПО: профилактика девиантного, суицидального поведения, безопасного поведения студентов в сети Интернет»," +
                    "ФГАОУ ДПО «Академия Минпросвещения России», 2021 г.",
            8,8
        ),
    )

    private val workers = listOf(
        Workers(0, "Кочеткова Татьяна Борисовна",
            "Высшее, ОГПИ им. Т.Г. Шевченко, 1998г.",
            "Учитель предпринимательства, учитель технологии обработки конструкционных материалов и технического творчества по специальности «Технология и предпринимательство»",
            "Директор","-","Высшая категория «Преподаватель», приказ от 06.12.2018 №01-21/2260 Почетный работник сферы образования РФ, 2023 г.",
            "Профессиональная переподготовка:\n" +
                    "ФГБОУ ВПО Всероссийский заочный финансово-экономический институт в г. Челябинске по программе «Государственное и муниципальное управление»," +
                    " 2013г.Повышение квалификации:Воспитательная деятельность в учреждениях СПО" +
                    "\" (ФГБ ОУ \"Международный детский центр \"Артек\", 2022 г. Управление опережающим развитием образовательных систем и образовательных организаций»," +
                    " ФГБОУ ДПО «Институт развития профессионального образования», 2022",
            28, 0
        ),
        Workers(1, "Кузниченко Оксана Анатольевна",
            "Высшее, Оренбургский государственный университет, 1999г.",
            "Учитель физики, математики, информатики и вычислительной техники по спец. «Физика»",
            "Заместитель директора по УР, преподаватель","Информатика","Высшая категория «Преподаватель», приказ от 27.12.2019 №01-21/2480, приказ от 06.12.2018 №01-21/2260 Почетный работник сферы образования РФ, 2023 г.",
            "Профессиональная переподготовка:\n" +
                    "ФГБОУ ВПО Всероссийский заочный финансово-экономический институт в г. Челябинске по программе «Государственное и муниципальное управление», 2013г.\n" +
                    "Повышение квалификации:\n" +
                    "Подготовка региональных экспертов конкурсов профессионального мастерства \"Абилимпикс\", Региональный центр обучения экспертов \"Абилимпикс\" Оренбургской области ГАПОУ \"Оренбургский автотранспортный колледж им. заслуженного учителя РФ В.Н. Бевзюка\", 2022 г.;" +
                    "Инновационные формы работы в профессиональном образовании, Ассоциация образовательных организаций «Профессионал», г. Самара, 2022 г." +
                    "Подготовка региональных экспертов конкурсов профессионального мастерства \"Абилимпикс\", Региональный центр обучения экспертов \"Абилимпикс\" Оренбургской области ГАПОУ Оренбургский автотранспортный колледж, 2022г.",
            21, 21
        ),
        Workers(2, "Косынцева Ольга Владимировна",
            "Высшее, ОГПИ им. Т.Г. Шевченко, 1997г",
            "Учитель русского языка и литературы по специальности «Филология»",
            "Заместитель директора по УВР, преподаватель","История","Высшая категория «Преподаватель», приказ от 03.12.2020 №01-21/1616",
            "Профессиональная переподготовка:\n" +
                    "ФГБОУ ВПО «Оренбургский государственный университет»: профессиональная переподготовка по программе «История», 510 ч., 2014 г.\n" +
                    "УДПО «УМЦ профсоюзов» Оренбургской области:\n" +
                    "профессиональная переподготовка по программе «Менеджмент»,320 ч., 2017 г.\n" +
                    "Повышение квалификации:\n" +
                    "Воспитательная деятельность в системе СПО: профилактика девиантного, суицидального поведения, безопасного поведения студентов в сети Интернет», ФГАОУ ДПО «Академия Минпросвещения России», 2021 г." +
                    "Проектирование рабочих программ воспитания в ПОО, ФГБНУ «ИИДСВ РАО», 2021 г.;" +
                    "«Методика преподавания общеобразовательной дисциплины «История» с учетом профессиональной направленности основных образовательных программ среднего профессионального образования», ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2021г.;" +
                    "Воспитательная деятельность в учреждениях СПО\" (ФГБ ОУ \"Международный детский центр \"Артек\", 2022 г." +
                    "\"Разговоры о важном: система работы классного руководителя (куратора)\", ФГАОУ ДПО \"Академия Минпросвещения Россиии\", 2022 г." +
                    "Профилактика терроризма и экстремизма в молодежной среде, ООДОО «Оренбургские каникулы», 2023 г.",
            25, 25
        ),
        Workers(3, "Массанова Елена Анатольевна",
            "Высшее, АНОУ ВПО «МФЮА», 2003 г.Высшее, ФГАОУ ВО «Национальный исследовательский технологический университет «МИСиС» г. Москва, 2016 г.",
            "Экономист по специальности «Финансы и кредит» Бакалавр по направлению подготовки 13.03.04 Теплоэнергетика и теплотехника",
            "Заместитель директора по УПР, преподаватель","Специальные дисциплины, УП и ПП по 13.02.02 Теплоснабжение и теплотехническое оборудование","Высшая категория «Преподаватель», приказ от 05.10.2022 №01-21/1374",
            "Профессиональная переподготовка:\n" +
                    "УДПО «УМЦ профсоюзов» Оренбургской области: «Профессиональное обучение, среднее профессиональное образование, дополнительное профессиональное образование», 392 ч., 2017 г.\n" +
                    "Повышение квалификации:\n" +
                    "«Промышленная, энергетическая безопасность, безопасность гидротехнических сооружений» по направлению «Общие требования промышленной безопасности», АНО ДПО «Верифекс», 2023 г.",
            24, 0
        ),
        Workers(4, "Финк Игорь Валерьевич",
            "Высшее, ГОУ ВПО «ОГУ», 2004г.",
            "Инженер по спец. «Программное обеспечение вычислительной техники и автоматизированных систем»",
            "Заместитель директора по УИТ, преподаватель","Специальные дисциплины, УП и ПП по 09.02.07 Информационные системы и программирование","Высшая категория «Преподаватель», приказ от 03.12.2020 №01-21/1616\n" +
                    "Почетный работник сферы образования РФ, 2022 г",
            "Профессиональная переподготовка:\n" +
                    "ФГБОУ ВПО Всероссийский заочный финансово-экономический институт в г. Челябинске, «Государственное и муниципальное управление», 2013г." +
                    "- УДПО «Учебно-методический центр Федерации организаций профсоюзов Оренбургской области», «Профессиональное обучение, среднее профессиональное образование, дополнительное профессиональное образование», 392 ч., 2016 г.\n" +
                    "Повышение квалификации:\n" +
                    "Программа повышения квалификации наставников по проведению рефлексии профессиональных проб и модели осознанности и целеустремленности   у обучающихся 6-11 классов, ФГБ ОУ ВО «Московский государственный психолого-педагогический университет», 2020 г.;" +
                    "Подготовка региональных экспертов конкурсов профессионального мастерства \"Абилимпикс\", Региональный центр обучения экспертов \"Абилимпикс\" Оренбургской области ГАПОУ \"Оренбургский автотранспортный колледж им. заслуженного учителя РФ В.Н. Бевзюка\", 2022 г.",
            20, 16
        ),

    )

    fun getAllDirections(): List<Direction> = directions
    fun findDirectionByCode(code: String): List<Direction> =
        directions.filter { it.code.contains(code, ignoreCase = true) }
    fun findDirectionByName(name: String): List<Direction> =
        directions.filter { it.name.contains(name, ignoreCase = true) }

    fun getAllWorkers(): List<Workers> = workers
    fun findWorkersByPost(teachingSubjects: String): List<Workers> =
        workers.filter { it.teachingSubjects.contains(teachingSubjects, ignoreCase = true) }
    fun findWorkersByName(name: String): List<Workers> =
        workers.filter { it.fullName.contains(name, ignoreCase = true) }
    fun findWorkersByPosition(position: String): List<Workers> =
        workers.filter { it.position.contains(position, ignoreCase = true) }

    fun getAllTeacher(): List<Workers> = teachers
    fun findTeacherByPost(teachingSubjects: String): List<Workers> =
        teachers.filter { it.teachingSubjects.contains(teachingSubjects, ignoreCase = true) }
    fun findTeacherByName(name: String): List<Workers> =
        teachers.filter { it.fullName.contains(name, ignoreCase = true) }
    fun findTeacherByPosition(position: String): List<Workers> =
        teachers.filter { it.position.contains(position, ignoreCase = true) }
}