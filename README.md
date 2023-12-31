# ماشین حساب

این پروژه یک ماشین حساب ساده بدون رابط کاربری و تحت خط فرمان ایجاد شده است و هدف آن، انجام دستورات و نیازمندی‌های موجود در آزمایش اول درس آز مهندسی نرم‌افزار است. این پروژه به زبان جاوا زده شده است.
مطابق نیازمندی‌ها حداقل 15 کامیت در این پروژه قرار دارد. عمل push بر روی master تنها به وسیله pull request ممکن است و امکان merge وجود ندارد. برای هر فیچر یک branch ایجاد شده است. همچنین branch های دیگه‌ای مانند wip و bug در بین انها وجود دارد. همچنین کامیت‌ها از قاعده Type: description پیروی می‌کنند و نام برنچ ها از قاعده authorname-type-name پیروی می‌کند. حداقل 2 کانفلیکت نیز در پروژه برطرف شده است. همچنین در فایل .gitignore به پروژه افزوده شده است.

## سوالات
سوال 1 : 
<br>
پوشه `.git` جایی است که گیت در آن متادیتا و دیتابیس اشیا را برای پروژه ذخیره می‌کند. این یکی از مهم ترین پارت‌های گیت است. پوشه `.git` شامل تمام فایل ها و داده های لازم است که Git برای مدیریت تاریخچه کنترل نسخه repo و ردیابی تغییرات فایل ها استفاده می کند. برای مثال این پوشه موارد زیر را در خود دارد:
- پوشه branch که اطلاعات مربوط به شاخه های مختلف را در مخزن ذخیره می کند.
- پوشه hooks که حاوی اسکریپت هایی است که می توانند در نقاط خاصی از گردش کار Git مانند قبل یا بعد از commit یا push اجرا شوند.
- پوشه objects که تمام اشیاء ایجاد شده توسط Git از جمله blobs (محتوای فایل)، trees (ساختارهای دایرکتوری) و commit ها را ذخیره می کند. این اشیا با SHA-1 شناسایی می شوند.
- پوشه refs که حاوی ارجاعاتی به اشیاء مختلف Git، مانند شاخه‌ها، تگ‌ها و مراجع راه دور است.
- فایل config که شامل تنظیمات پیکربندی repo، مانند نام کاربری، ایمیل، و URL های remote repo است.
- فایل index که اطلاعات مربوط به فایل ها و تغییراتی را که آماده انجام هستند ذخیره می کند.
- فایل HEAD که به شاخه یا commit فعلی که بررسی شده است اشاره می کند.
- و بسیاری موارد دیگر که همگی در این پوشه قرار دارند.
<br>
<br>

سوال 2 :
<br>
اتمیک بودن کامیت به این معناست که شما می‌توان از آن کامیت rollback کرد بدون آن که اثرات جانبی بد و پشیمانی‌ای به وجود آید. اگر یک کامیت پاک شود ولی باعث شود تغییرات که در گذشته به درستی اعمال شده بود تغییر کنند یا از بین بروند، به معنی آن است که ان کامیت اتمیک نیست. یک atomic commit تضمین می کند که تمام تغییرات ایجاد شده در repo به عنوان بخشی از یک تغییر منطقی واحد با هم و به عنوان یک واحد انجام می شوند. هنگام انجام یک atomic commit در Git، تمام تغییرات ایجاد شده در فایل ها با هم مرحله بندی و انجام می شود. این بدان معنی است که یا تمام تغییرات ایجاد شده در commit با موفقیت در repo اعمال می شود یا هیچ یک از آنها اعمال نمی شود. اگر هر بخشی از commit با شکست مواجه شود، کل commit برگشت داده می شود و مخزن بدون تغییر باقی می ماند. ویژگی اتمیک commit در Git به حفظ یکپارچگی و سازگاری repo کمک می کند. این تضمین می‌کند که هر commit مجموعه کامل و منسجمی از تغییرات را نشان می‌دهد، که درک تاریخچه پروژه را آسان‌تر می‌کند و امکان همکاری آسان‌تر با توسعه‌دهندگان دیگر را فراهم می‌کند.
<br>
مکانیزم pull request در Git مکانیزمی برای پیشنهاد و بررسی تغییرات در یک repo است و به توسعه دهندگان اجازه می دهد تا تغییرات خود را به یک branch در repo ارسال کنند و درخواست کنند که این تغییرات در یک branch دیگر ادغام شوند. مکانیزم pull request از اصل ایجاد یک تغییر متمرکز که کامل و مستقل است پیروی می کند. این بدان معناست که درخواست کشش باید یک مشکل واحد را برطرف کند، یک باگ را برطرف کند یا یک ویژگی خاص را پیاده سازی کند. تغییرات در درخواست کشش باید مستقل باشند و به تغییرات نامرتبط دیگر وابسته نباشند.با atomic نگه داشتن pull request، بررسی و درک تغییرات پیشنهادی آسان تر می شود. این به code review کنندگان اجازه می دهد تا بر روی یک تغییر یا ویژگی خاص تمرکز کنند بدون اینکه تحت تأثیر تغییرات نامرتبط قرار گیرند. همچنین ردیابی و مدیریت تغییرات در تاریخچه repo را آسان‌تر می‌کند، زیرا هر pull request یک واحد مجزا و معنی‌دار کار را نشان می‌دهد.
<br>
<br>

سوال 3 :
<br>
چهار دستور 'fetch'، 'rebase'، 'pull' و 'merge' برای ادغام تغییرات از یک remote repo با local repo استفاده می شوند. اما در نحوه مدیریت و ادغام متفاوت هستند.
- دستور fetch آپدیت‌های remote repo را دریافت می‌کند ولی به طور خودکار با local repo ادغام نمی‌کند.این دستور remote branch را در local repo آپدیت می کند و به کمک آن می توان دید چه تغییراتی در remote repo ایجاد شده است.
- دستور merge برای ترکیب تغییرات از یک branch به branch دیگر استفاده می شود. این دستور یک commit جدید ایجاد می کند که تغییرات هر دو branch را در بر می گیرد.
- دستور Rebase برای ترکیب تغییرات از یک branch به branch دیگر استفاده می شود و کاربرد آن بیشتر در آپدیت کردن local branch با آخرین تغییرات remote branch است. برای این کار کامیت های موجود در local branch را در بالای آخرین تغییرات upstream branch قرار می دهد.
- دستور pull ترکیبی از دو دستور fetch و merge است. دستور pull آخرین تغییرات را از remote repo دریافت می کند و به طور خودکار آنها را با local repo ادغام می کند. 
<br>
<br>

سوال 4 : 
<br>
سه دستور  'reset' ، 'revert' و 'restore' برای لغو یا حذف تغییرات در یک repo استفاده می‌شوند. اما در نحوه انجام این کار و نتایجی که ایجاد می کنند، متفاوت هستند.
- دستور restore برای حذف تغییرات در working directory و بازگرداندن فایل ها به حالت قبلی استفاده می شود. این دستور تغییرات را حذف می کند و working directory را به حالت commit قبلی برمیگرداند. این دستور فقط بر working directory تأثیر می گذارد و تاریخچه commit را تغییر نمی دهد.
- دستور reset برای انتقال HEAD به یک commit خاص استفاده می شود و branch را به آن حالت برمیگرداند. این دستور تاریخچه commit را با حذف یا جابجایی commit ها تغییر می دهد و در صورت عدم استفاده با دقت باعث از دست رفتن commit ها می شود. برای مثال با دستور `git checkout test-feature reset HEAD~2` اگر در برنچ `test-feature` ما 3 کامیت داشته باشیم با این دستور می‌توانیم به کامیت اول برگردیم و 2 کامیت قبلی را حذف کنیم.
- دستور rebase برای ایجاد یک commit جدید استفاده می شود تا تغییرات ایجاد شده توسط یک commit خاص را از بین ببرد و به اصطلاح، کامیت را برعکس کند بدون انکه تاریخجه را تغییر دهد. برای اینکار یک commit جدید ایجاد می شود تا تغییرات ایجاد شده توسط commit مشخص شده را بازگرداند و اطمینان حاصل شود که تاریخچه commit دست نخورده باقی می ماند.
<br>
<br>

سوال 5 : 
<br>
مرحله stage فرآیند آماده سازی تغییرات برای commit به repo اشاره دارد و یک مرحله میانی بین working directory و commit است. در واقع زمانی که تغییراتی ایجاد می کنیم، می توانیم به کمک دستور git add بخشی از یا همه تغییرات را به مرحله stage ببریم تا مشخص کنیم که با commmit کردن در این مرحله، چه تغییراتی را قرار است اعمال کنیم.
<br>
دستور stash برای ذخیره موقت تغییراتی که در working directory ایجاد شده اند اما هنوز قرار نیست که commit شوند، به کار گرفته می شود. کاربرد آن در ذخیره کردن تغییراتی است که اعمال شده انند اما هنوز قرار نیست commit شوند و می خواهیم آنها را ذخیره کنیم و به سراغ branch دیگری برویم. نحوه اجرای آن توسط گیت بدین صورت است که ابتدا تمام تغییرات را در یک new stash ذخیره می کند و working directory را به حالت قبل از تغییرات و آخرین commit برمیگرداند. در ادامه می توان بین branch ها جابه‌جا شد و تغییرات دیگری را اعمال کرد. سپس می توان با اجرای دستور `git stash application`، تغییرات را بازیابی کرد و به سایر موارد پرداخت.
<br>
<br>

سوال 6 : 
<br>
در گیت، snapshot به وضعیت تمام فایل های پروژه در یک نقطه خاص از زمان اشاره دارد. گیت از یک رویکرد مبتنی بر snapshot برای کنترل نسخه استفاده می کند، که در آن هر commit یک snapshot از کل فایل های پروژه را نشان می دهد. وقتی در فایل های پروژه تغییراتی ایجاد شوند، گیت این تغییرات را به عنوان Delta بین وضعیت فعلی فایل ها و snapshot قبلی ثبت می کند. این رویکرد با سیستم‌هایی که تفاوت‌های سطح فایل را ذخیره می‌کنند یا تغییرات را به صورت تدریجی دنبال می‌کنند متفاوت است. در مدیریت و کنترل نسخه، عمدتا این دو رویکرد وجود دارد که رویکرد گیت، snapshot است.

