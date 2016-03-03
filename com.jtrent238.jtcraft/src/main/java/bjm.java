/*    */ import java.util.Hashtable;
/*    */ import javax.naming.directory.Attribute;
/*    */ import javax.naming.directory.Attributes;
/*    */ import javax.naming.directory.DirContext;
/*    */ import javax.naming.directory.InitialDirContext;
/*    */ 
/*    */ 
/*    */ public class bjm
/*    */ {
/*    */   private final String a;
/*    */   private final int b;
/*    */   
/*    */   protected bjm(String paramString, int paramInt)
/*    */   {
/* 15 */     this.a = paramString;
/* 16 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public String a() {
/* 20 */     return this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 24 */     return this.b;
/*    */   }
/*    */   
/*    */   public static bjm a(String paramString) {
/* 28 */     if (paramString == null) { return null;
/*    */     }
/* 30 */     String[] arrayOfString = paramString.split(":");
/*    */     Object localObject;
/* 32 */     if (paramString.startsWith("[")) {
/* 33 */       int i = paramString.indexOf("]");
/* 34 */       if (i > 0) {
/* 35 */         String str2 = paramString.substring(1, i);
/* 36 */         localObject = paramString.substring(i + 1).trim();
/* 37 */         if ((((String)localObject).startsWith(":")) && (((String)localObject).length() > 0)) {
/* 38 */           localObject = ((String)localObject).substring(1);
/* 39 */           arrayOfString = new String[2];
/* 40 */           arrayOfString[0] = str2;
/* 41 */           arrayOfString[1] = localObject;
/*    */         } else {
/* 43 */           arrayOfString = new String[1];
/* 44 */           arrayOfString[0] = str2;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 49 */     if (arrayOfString.length > 2) {
/* 50 */       arrayOfString = new String[1];
/* 51 */       arrayOfString[0] = paramString;
/*    */     }
/*    */     
/* 54 */     String str1 = arrayOfString[0];
/* 55 */     int j = arrayOfString.length > 1 ? a(arrayOfString[1], 25565) : 25565;
/*    */     
/* 57 */     if (j == 25565) {
/* 58 */       localObject = b(str1);
/* 59 */       str1 = localObject[0];
/* 60 */       j = a(localObject[1], 25565);
/*    */     }
/*    */     
/* 63 */     return new bjm(str1, j);
/*    */   }
/*    */   
/*    */   private static String[] b(String paramString) {
/*    */     try {
/* 68 */       String str = "com.sun.jndi.dns.DnsContextFactory";
/*    */       
/* 70 */       Class.forName("com.sun.jndi.dns.DnsContextFactory");
/*    */       
/* 72 */       Hashtable localHashtable = new Hashtable();
/* 73 */       localHashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
/* 74 */       localHashtable.put("java.naming.provider.url", "dns:");
/* 75 */       localHashtable.put("com.sun.jndi.dns.timeout.retries", "1");
/* 76 */       InitialDirContext localInitialDirContext = new InitialDirContext(localHashtable);
/* 77 */       Attributes localAttributes = localInitialDirContext.getAttributes("_minecraft._tcp." + paramString, new String[] { "SRV" });
/* 78 */       String[] arrayOfString = localAttributes.get("srv").get().toString().split(" ", 4);
/* 79 */       return new String[] { arrayOfString[3], arrayOfString[2] };
/*    */     } catch (Throwable localThrowable) {}
/* 81 */     return tmp142_138;
/*    */   }
/*    */   
/*    */   private static int a(String paramString, int paramInt)
/*    */   {
/*    */     try {
/* 87 */       return Integer.parseInt(paramString.trim());
/*    */     }
/*    */     catch (Exception localException) {}
/*    */     
/* 91 */     return paramInt;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */