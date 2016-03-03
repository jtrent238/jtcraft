/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import java.util.Hashtable;
/*    */ import javax.naming.directory.Attribute;
/*    */ import javax.naming.directory.Attributes;
/*    */ import javax.naming.directory.DirContext;
/*    */ import javax.naming.directory.InitialDirContext;
/*    */ 
/*    */ public class RealmsServerAddress
/*    */ {
/*    */   private final String host;
/*    */   private final int port;
/*    */   
/*    */   protected RealmsServerAddress(String paramString, int paramInt)
/*    */   {
/* 16 */     this.host = paramString;
/* 17 */     this.port = paramInt;
/*    */   }
/*    */   
/*    */   public String getHost() {
/* 21 */     return this.host;
/*    */   }
/*    */   
/*    */   public int getPort() {
/* 25 */     return this.port;
/*    */   }
/*    */   
/*    */   public static RealmsServerAddress parseString(String paramString) {
/* 29 */     if (paramString == null) { return null;
/*    */     }
/* 31 */     String[] arrayOfString = paramString.split(":");
/*    */     Object localObject;
/* 33 */     if (paramString.startsWith("[")) {
/* 34 */       int i = paramString.indexOf("]");
/* 35 */       if (i > 0) {
/* 36 */         String str2 = paramString.substring(1, i);
/* 37 */         localObject = paramString.substring(i + 1).trim();
/* 38 */         if ((((String)localObject).startsWith(":")) && (((String)localObject).length() > 0)) {
/* 39 */           localObject = ((String)localObject).substring(1);
/* 40 */           arrayOfString = new String[2];
/* 41 */           arrayOfString[0] = str2;
/* 42 */           arrayOfString[1] = localObject;
/*    */         } else {
/* 44 */           arrayOfString = new String[1];
/* 45 */           arrayOfString[0] = str2;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 50 */     if (arrayOfString.length > 2) {
/* 51 */       arrayOfString = new String[1];
/* 52 */       arrayOfString[0] = paramString;
/*    */     }
/*    */     
/* 55 */     String str1 = arrayOfString[0];
/* 56 */     int j = arrayOfString.length > 1 ? parseInt(arrayOfString[1], 25565) : 25565;
/*    */     
/* 58 */     if (j == 25565) {
/* 59 */       localObject = lookupSrv(str1);
/* 60 */       str1 = localObject[0];
/* 61 */       j = parseInt(localObject[1], 25565);
/*    */     }
/*    */     
/* 64 */     return new RealmsServerAddress(str1, j);
/*    */   }
/*    */   
/*    */   private static String[] lookupSrv(String paramString) {
/*    */     try {
/* 69 */       String str = "com.sun.jndi.dns.DnsContextFactory";
/*    */       
/* 71 */       Class.forName("com.sun.jndi.dns.DnsContextFactory");
/*    */       
/* 73 */       Hashtable localHashtable = new Hashtable();
/* 74 */       localHashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
/* 75 */       localHashtable.put("java.naming.provider.url", "dns:");
/* 76 */       localHashtable.put("com.sun.jndi.dns.timeout.retries", "1");
/* 77 */       InitialDirContext localInitialDirContext = new InitialDirContext(localHashtable);
/* 78 */       Attributes localAttributes = localInitialDirContext.getAttributes("_minecraft._tcp." + paramString, new String[] { "SRV" });
/* 79 */       String[] arrayOfString = localAttributes.get("srv").get().toString().split(" ", 4);
/* 80 */       return new String[] { arrayOfString[3], arrayOfString[2] };
/*    */     } catch (Throwable localThrowable) {}
/* 82 */     return tmp142_138;
/*    */   }
/*    */   
/*    */   private static int parseInt(String paramString, int paramInt)
/*    */   {
/*    */     try {
/* 88 */       return Integer.parseInt(paramString.trim());
/*    */     }
/*    */     catch (Exception localException) {}
/*    */     
/* 92 */     return paramInt;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsServerAddress.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */