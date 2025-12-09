package com.javarush.telegram;


import com.javarush.telegram.ChatGPTService;
import com.javarush.telegram.DialogMode;
import com.javarush.telegram.MultiSessionTelegramBot;
import com.javarush.telegram.UserInfo;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import java.time.LocalDate;

import java.time.ZoneId;
import java.util.ArrayList;

public class TinderBoltApp extends MultiSessionTelegramBot {
    public static final String TELEGRAM_BOT_NAME = "Pipi_Love_Bot"; //TODO: добавь имя бота в кавычках
    public static final String TELEGRAM_BOT_TOKEN = "8572864971:AAFF-YrXsJqWMSmMYkEoKBUeF2eP3p1pu0w"; //TODO: добавь токен бота в кавычках
    public static final String OPEN_AI_TOKEN = "gpt:4dws6NYyD0BDK2ufp71ZJFkblB3TCC3tppbmX6OYmhSFydbM"; //TODO: добавь токен ChatGPT в кавычках
    private final ChatGPTService chatGPT = new ChatGPTService(OPEN_AI_TOKEN);
    private DialogMode currentMode = null;
    private ArrayList<String> list = new ArrayList<>();

    public TinderBoltApp() {
        super(TELEGRAM_BOT_NAME, TELEGRAM_BOT_TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
        //TODO: основной функционал бота будем писать здесь
        String message = getMessageText();

        if (message.equals("/start")) {
            currentMode = DialogMode.MAIN;
            sendPhotoMessage ( "main");
            String text = loadMessage("main");
            sendTextMessage (text);

            showMainMenu (" главное меню бота", "/start",
                    "Код на сегодня", "/code");
//                    "сообщение для знакомства \uD83E\uDD70T", "/opener",
//                    "переписка от вашего имени \uD83D\uDE08", "/message",
//                    "переписка со звездами \uD83D\uDD25", "/date",
//                    "задать вопрос чату GPT \uD83E\uDDE0", "/gpt");
            return;
        }
//        if (message.equals(("/gpt"))) {
//            currentMode = DialogMode.GPT;
//            sendPhotoMessage("gpt");
//            String text = loadMessage ("gpt");
//            sendTextMessage(text);
//        }

        if (message.equals(("/code"))) {
            currentMode = DialogMode.CODE;
            sendPhotoMessage("Gift");
            LocalDate date = LocalDate.now(ZoneId.of("Asia/Omsk"));
            LocalDate data1 = LocalDate.of(2025, 12, 1);
            LocalDate data2 = LocalDate.of(2025, 12, 2);
            LocalDate data3 = LocalDate.of(2025, 12, 3);
            LocalDate data4 = LocalDate.of(2025, 12, 4);
            LocalDate data5 = LocalDate.of(2025, 12, 5);
            LocalDate data6 = LocalDate.of(2025, 12, 6);
            LocalDate data7 = LocalDate.of(2025, 12, 7);
            LocalDate data8 = LocalDate.of(2025, 12, 8);
            LocalDate data9 = LocalDate.of(2025, 12, 9);
            LocalDate data10 = LocalDate.of(2025, 12, 10);
            LocalDate data11 = LocalDate.of(2025, 12, 11);
            LocalDate data12 = LocalDate.of(2025, 12, 12);
            LocalDate data13 = LocalDate.of(2025, 12, 13);
            LocalDate data14 = LocalDate.of(2025, 12, 14);
            LocalDate data15 = LocalDate.of(2025, 12, 15);
            LocalDate data16 = LocalDate.of(2025, 12, 16);
            LocalDate data17 = LocalDate.of(2025, 12, 17);
            LocalDate data18 = LocalDate.of(2025, 12, 18);
            LocalDate data19 = LocalDate.of(2025, 12, 19);
            LocalDate data20 = LocalDate.of(2025, 12, 20);
            LocalDate data21 = LocalDate.of(2025, 12, 21);
            LocalDate data22 = LocalDate.of(2025, 12, 22);
            LocalDate data23 = LocalDate.of(2025, 12, 23);
            LocalDate data24 = LocalDate.of(2025, 12, 24);
            LocalDate data25 = LocalDate.of(2025, 12, 25);
            LocalDate data26 = LocalDate.of(2025, 12, 26);
            LocalDate data27 = LocalDate.of(2025, 12, 27);
            LocalDate data28 = LocalDate.of(2025, 12, 28);
            LocalDate data29 = LocalDate.of(2025, 12, 29);
            LocalDate data30 = LocalDate.of(2025, 12, 30);
            LocalDate data31 = LocalDate.of(2025, 12, 31);
            if ((date.isEqual(data1))) {
                sendTextMessage("Номер подарка на сегодня 544 \n(Для прекрасного дня)");  // киндер 544 🎄🎄🎄❄️❄️❄️🎅🎅🎅
            } else if (date.isEqual(data2)) {
                sendTextMessage("Номер подарка на сегодня 821 \n(Для хорошего время препровождения в уютные вечра)"); //  Полианна и закладка 821
            } else if (date.isEqual(data3)) {
                sendTextMessage("Номер подарка на сегодня 762 \n(Люблю тебя)"); // Лов ис жвачка 762
            } else if (date.isEqual(data4)) {
                sendTextMessage("Номер подарка на сегодня 242 \n(Что бы твоим ушкам всегда было тепло)"); // Наушники теплые 242
            } else if (date.isEqual(data5)) {
                sendTextMessage("Номер подарка на сегодня 11 \n(Что бы в твоей жизни всё так же сладко было)"); // сникерс 11
            } else if (date.isEqual(data6)) {
                sendTextMessage("Номер подарка на сегодня 275 \n(Что бы твоё личико выглядело так же прекрасно)"); // маски для лица 275
            } else if (date.isEqual(data7)) {
                sendTextMessage("Номер подарка на сегодня 784 \n(Левая или правая)"); // Твикс 784
            } else if (date.isEqual(data8)) {
                sendTextMessage("Номер подарка на сегодня 813 \n(Новогоднего настроения вам в дом)"); // Елка и герлянда 813
            } else if (date.isEqual(data9)) {
                sendTextMessage("Номер подарка на сегодня 340 \n(Сладоть гадость)"); // Ритер спорт 340
            } else if (date.isEqual(data10)) {
                sendTextMessage("Номер подарка на сегодня 801 \n(Для уютных зимних вечеров)"); // Какао с маршмелоу 801
            } else if (date.isEqual(data11)) {
                sendTextMessage("Номер подарка на сегодня 368 \n(Всё везде и сразу)"); // Кит кат рафаело и крем 368
            } else if (date.isEqual(data12)) {
                sendTextMessage("Номер подарка на сегодня 825 \n(Что бы ножки не мерзли)"); // Тапочки 825
            } else if (date.isEqual(data13)) {
                sendTextMessage("Номер подарка на сегодня 288 \n(Пусть маленькие радости делают приятным каждый твой день)"); // Киндер шоколад 288
            } else if (date.isEqual(data14)) {
                sendTextMessage("Номер подарка на сегодня 559 \n(Что бы согревал вас со всей любовью)"); // Плед 559
            } else if (date.isEqual(data15)) {
                sendTextMessage("Номер подарка на сегодня 270 \n(Самый лучший подарок)"); // Маленькие женщины и закладка 270
            } else if (date.isEqual(data16)) {
                sendTextMessage("Номер подарка на сегодня 859 \n(Новогодний аромат)"); // Аромодифузер 859
            } else if (date.isEqual(data17)) {
                sendTextMessage("Номер подарка на сегодня 428 \n(И на голову тоже новогоднего настроения)"); // Калпак 428
            } else if (date.isEqual(data18)) {
                sendTextMessage("Номер подарка на сегодня 406 \n(Merry christmas)"); // Кружка 406
            } else if (date.isEqual(data19)) {
                sendTextMessage("Номер подарка на сегодня 201 \n(Что бы силы и бодрость всегда были с вами)"); // Монстр 201
            } else if (date.isEqual(data20)) {
                sendTextMessage("Номер подарка на сегодня 172 \n(Держи голову в холоде, живот в голове, а ноги в тепле)"); // Носки 172
            } else if (date.isEqual(data21)) {
                sendTextMessage("Номер подарка на сегодня 281 \n(Для хорошего чаепития)"); // Чай 281
            } else if (date.isEqual(data22)) {
                sendTextMessage("Номер подарка на сегодня 592 \n(Новогодний мерч подъехал)"); // Футболка 592
            } else if (date.isEqual(data23)) {
                sendTextMessage("Номер подарка на сегодня 96 \n(\uD83D\uDC9D)"); // Газировка лов ис 96
            } else if (date.isEqual(data24)) {
                sendTextMessage("Номер подарка на сегодня 535 \n(Что бы запячетлить все прекрасные моменты вашей жизни)"); // Фотоапарат 535
            } else if (date.isEqual(data25)) {
                sendTextMessage("Номер подарка на сегодня 929 \n(\uD83D\uDE33\uD83D\uDE18\uD83D\uDE44)"); // Трусы 929
            } else if (date.isEqual(data26)) {
                sendTextMessage("Номер подарка на сегодня 603 \n(Для атмосферы)"); // Свечи 603
            } else if (date.isEqual(data27)) {
                sendTextMessage("Номер подарка на сегодня 283 \n(Не 10 кг, но тоже не плохо)"); // Мармелад 283
            } else if (date.isEqual(data28)) {
                sendTextMessage("Номер подарка на сегодня 887 \n(Что бы ключи не терялись больше никогда)"); // Тотаро и лов ис конфетки 887
            } else if (date.isEqual(data29)) {
                sendTextMessage("Номер подарка на сегодня 848 \n(Для хорошего сна)"); // Космонавт 848
            } else if (date.isEqual(data30)) {
                sendTextMessage("Номер подарка на сегодня 745 \n(Что бы раслабиться отлично)"); // Бомбочки для ванн 745
            } else if (date.isEqual(data31)) {
                sendTextMessage("Номер подарка на сегодня 52 \n(Что бы сиять \uD83D\uDC8E\uD83D\uDC96)"); // Сережки и подвеска 52
            }
        }

        if (currentMode == DialogMode.CODE) {

        }




        if (currentMode == DialogMode.GPT) {
            String prompt = loadPrompt ("gpt");
            Message msg = sendTextMessage("Подождите пару секуд - ChatGPT думает...");
            String answer = chatGPT.sendMessage(prompt, message);
            updateTextMessage(msg, answer);
            return;
        }

        if (message. equals("/date")) {
            currentMode = DialogMode.DATE;
            sendPhotoMessage("date");
            String text = loadMessage("date");
            sendTextButtonsMessage(text,
                    "Ариана Гранде", "date_grande",
                    "Марго Робби", "date_robbie",
                    "Зендея", "date_zendaya",
                    "Райн Гослинг", "date_gosling",
                    "Том Харди", "date_hardy");
            return;
        }

        if (currentMode== DialogMode.DATE) {
            String query = getCallbackQueryButtonKey() ;
            if (query.startsWith("date_")) {
                sendPhotoMessage(query);
                sendTextMessage(" Отличный выбор!\nТвоя задача пригласить девушку/парня на свидание \uFE0F за 5 сообщения. ");
                String promt = loadPrompt(query);
                chatGPT.setPrompt(promt);
                return;
            }
            Message msg = sendTextMessage("Подождите пару секуд - ChatGPT думает...");
            String answer = chatGPT.addMessage(message);
            updateTextMessage(msg, answer);
            return;
        }

        if (message.equals("/message")){
            currentMode = DialogMode.MESSAGE;
            sendPhotoMessage("message");
            sendTextButtonsMessage("Пришлите в чат вашу переписку",
                    "Следующее сообщение", "message_next",
                    "Пригласить на свидание", "message_date");
            return;
        }

        if (currentMode == DialogMode.MESSAGE) {
            String query = getCallbackQueryButtonKey();
            if (query.startsWith("message_")) {
                String prompt = loadPrompt (query);
                String userChatHistory = String. join("\n\n", list);
                Message msg = sendTextMessage("Подождите пару секуд - ChatGPT думает...");
                String answer = chatGPT.sendMessage(prompt, userChatHistory);
                updateTextMessage(msg, answer);
                return;
            }
            list.add (message);
            return;
        }

//        sendTextMessage ("*Привет!*");
//        sendTextMessage ("_Привет!_");
//        sendTextMessage("Вы написали " + message);
//
//        sendTextButtonsMessage( "Выберите режим работы:", "Старт", "start", "Стоп", "stop");
    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new TinderBoltApp());
    }
}
