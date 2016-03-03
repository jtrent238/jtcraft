/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.IllegalFormatException;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import org.apache.commons.io.Charsets;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ 
/*     */ 
/*     */ public class de
/*     */ {
/*  16 */   private static final Pattern a = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
/*  17 */   private static final Splitter b = Splitter.on('=').limit(2);
/*     */   
/*  19 */   private static de c = new de();
/*     */   
/*  21 */   private final Map d = Maps.newHashMap();
/*     */   private long e;
/*     */   
/*     */   public de() {
/*     */     try {
/*  26 */       InputStream localInputStream = de.class.getResourceAsStream("/assets/minecraft/lang/en_US.lang");
/*  27 */       for (String str1 : IOUtils.readLines(localInputStream, Charsets.UTF_8))
/*     */       {
/*  29 */         if ((!str1.isEmpty()) && (str1.charAt(0) != '#'))
/*     */         {
/*  31 */           String[] arrayOfString = (String[])Iterables.toArray(b.split(str1), String.class);
/*     */           
/*     */ 
/*  34 */           if ((arrayOfString != null) && (arrayOfString.length == 2))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  39 */             String str2 = arrayOfString[0];
/*  40 */             String str3 = a.matcher(arrayOfString[1]).replaceAll("%$1s");
/*     */             
/*  42 */             this.d.put(str2, str3);
/*     */           } } }
/*  44 */       this.e = System.currentTimeMillis();
/*     */     }
/*     */     catch (IOException localIOException) {}
/*     */   }
/*     */   
/*     */ 
/*     */   static de a()
/*     */   {
/*  52 */     return c;
/*     */   }
/*     */   
/*     */   public static synchronized void a(Map paramMap) {
/*  56 */     c.d.clear();
/*  57 */     c.d.putAll(paramMap);
/*  58 */     c.e = System.currentTimeMillis();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public synchronized String a(String paramString)
/*     */   {
/*  88 */     return c(paramString);
/*     */   }
/*     */   
/*     */   public synchronized String a(String paramString, Object... paramVarArgs) {
/*  92 */     String str = c(paramString);
/*     */     try {
/*  94 */       return String.format(str, paramVarArgs);
/*     */     } catch (IllegalFormatException localIllegalFormatException) {}
/*  96 */     return "Format error: " + str;
/*     */   }
/*     */   
/*     */   private String c(String paramString)
/*     */   {
/* 101 */     String str = (String)this.d.get(paramString);
/* 102 */     return str == null ? paramString : str;
/*     */   }
/*     */   
/*     */   public synchronized boolean b(String paramString) {
/* 106 */     return this.d.containsKey(paramString);
/*     */   }
/*     */   
/*     */   public long c() {
/* 110 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */