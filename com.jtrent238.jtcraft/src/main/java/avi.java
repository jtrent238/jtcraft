/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avi
/*    */ {
/* 17 */   private static final Logger a = ;
/* 18 */   private static Map b = new HashMap();
/* 19 */   private static Map c = new HashMap();
/*    */   
/* 21 */   private static Map d = new HashMap();
/* 22 */   private static Map e = new HashMap();
/*    */   
/*    */   private static void b(Class paramClass, String paramString) {
/* 25 */     b.put(paramString, paramClass);
/* 26 */     c.put(paramClass, paramString);
/*    */   }
/*    */   
/*    */   static void a(Class paramClass, String paramString) {
/* 30 */     d.put(paramString, paramClass);
/* 31 */     e.put(paramClass, paramString);
/*    */   }
/*    */   
/*    */   static {
/* 35 */     b(atc.class, "Mineshaft");
/* 36 */     b(avo.class, "Village");
/* 37 */     b(ate.class, "Fortress");
/* 38 */     b(auh.class, "Stronghold");
/* 39 */     b(aty.class, "Temple");
/*    */     
/* 41 */     asx.a();
/* 42 */     avp.a();
/* 43 */     atf.a();
/* 44 */     aui.a();
/* 45 */     atz.a();
/*    */   }
/*    */   
/*    */   public static String a(avm paramavm) {
/* 49 */     return (String)c.get(paramavm.getClass());
/*    */   }
/*    */   
/*    */   public static String a(avk paramavk) {
/* 53 */     return (String)e.get(paramavk.getClass());
/*    */   }
/*    */   
/*    */   public static avm a(dh paramdh, ahb paramahb)
/*    */   {
/* 58 */     avm localavm = null;
/*    */     try
/*    */     {
/* 61 */       Class localClass = (Class)b.get(paramdh.j("id"));
/* 62 */       if (localClass != null) localavm = (avm)localClass.newInstance();
/*    */     }
/*    */     catch (Exception localException) {
/* 65 */       a.warn("Failed Start with id " + paramdh.j("id"));
/* 66 */       localException.printStackTrace();
/*    */     }
/* 68 */     if (localavm != null) {
/* 69 */       localavm.a(paramahb, paramdh);
/*    */     } else {
/* 71 */       a.warn("Skipping Structure with id " + paramdh.j("id"));
/*    */     }
/* 73 */     return localavm;
/*    */   }
/*    */   
/*    */   public static avk b(dh paramdh, ahb paramahb) {
/* 77 */     avk localavk = null;
/*    */     try
/*    */     {
/* 80 */       Class localClass = (Class)d.get(paramdh.j("id"));
/* 81 */       if (localClass != null) localavk = (avk)localClass.newInstance();
/*    */     }
/*    */     catch (Exception localException) {
/* 84 */       a.warn("Failed Piece with id " + paramdh.j("id"));
/* 85 */       localException.printStackTrace();
/*    */     }
/* 87 */     if (localavk != null) {
/* 88 */       localavk.a(paramahb, paramdh);
/*    */     } else {
/* 90 */       a.warn("Skipping Piece with id " + paramdh.j("id"));
/*    */     }
/* 92 */     return localavk;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\avi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */