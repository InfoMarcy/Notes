	 //compile group: 'joda-time', name: 'joda-time', version: '2.10.8'
	// GET LOCAL TIME
	public static String getFecha() {
		// get the default time zone
		ZoneId defaultZoneId = ZoneId.systemDefault();
		// get the default time zone
		DateTimeZone timeZone = DateTimeZone.forID(defaultZoneId.toString());
		SimpleDateFormat headerFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
		// get the current time
		DateTime now = DateTime.now(timeZone);
		// convert DateTime to Date
		Date currentDate = now.toDate();
		String fecha = headerFormat.format(currentDate.getTime());
		return fecha;
	}

      // GET UTC TIME ZOME
	public static String getFecha() {
		SimpleDateFormat headerFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
		headerFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DATE, -1);
		String fecha = headerFormat.format(now.getTime());
		return fecha;
	}
	


	// get the local Date
	private void getLocalDate() {
		// format the date
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		// get the default time zone
		ZoneId defaultZoneId = ZoneId.systemDefault();
		// get the default time zone
		DateTimeZone timeZone = DateTimeZone.forID(defaultZoneId.toString());

		// get the current time
		DateTime now = DateTime.now(timeZone);
		// convert DateTime to Date
		Date currentDate = now.toDate();
		

		// inicio del dia
		DateTime todayStart = now.withTimeAtStartOfDay();
		// inicio de manana
		DateTime tomorrowStart = now.plusDays(1).withTimeAtStartOfDay();
		// intervalo de tiempo
		Interval today = new Interval(todayStart, tomorrowStart);

		log.info("timeZone => " + timeZone);
		log.info("now => " + now);
		log.info("currentDate => " + currentDate);
		log.info("todayStart => " + todayStart);
		log.info("tomorrowStart => " + tomorrowStart);
		log.info("today => " + today);
    }
