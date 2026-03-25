# Send Message to Telegram Bot

I was working on a project in python to send messages to a Telegram bot. This sparked my interest with an issue I was having at work with messaging to an external account from our IBM i.
I created this script and added it to our system, compiles and then ran it from a shell command

```bash
QSH CMD('cd /tmp && java /tmp/TelegramSend TOKEN CHATID "Message"')
```
and The message was successfully sent.

There was a little more to it then just that. the JAVA application needed to be compiled.

I had tons of trouble just getting the java script written, finally able to just create it after accessing from VS Code. using the IBM i Developer Package extention.

## Telegram Bot

You will need to create a bot on Telegram fairly easy process. This should help with additional info. https://core.telegram.org/api

