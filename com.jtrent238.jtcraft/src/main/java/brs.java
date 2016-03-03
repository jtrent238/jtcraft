/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.IllegalFormatException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import org.apache.commons.io.Charsets;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class brs
/*     */ {
/*  20 */   private static final Splitter b = Splitter.on('=').limit(2);
/*  21 */   private static final Pattern c = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
/*     */   
/*     */ 
/*  24 */   Map a = Maps.newHashMap();
/*     */   private boolean d;
/*     */   
/*     */   public synchronized void a(bqy parambqy, List paramList) {
/*  28 */     this.a.clear();
/*     */     
/*  30 */     for (String str1 : paramList) {
/*  31 */       str2 = String.format("lang/%s.lang", new Object[] { str1 });
/*     */       
/*  33 */       for (String str3 : parambqy.a()) {
/*     */         try {
/*  35 */           a(parambqy.b(new bqx(str3, str2)));
/*     */         }
/*     */         catch (IOException localIOException) {}
/*     */       }
/*     */     }
/*     */     String str2;
/*  41 */     b();
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  45 */     return this.d;
/*     */   }
/*     */   
/*     */   private void b() {
/*  49 */     this.d = false;
/*     */     
/*  51 */     int i = 0;
/*  52 */     int j = 0;
/*     */     
/*  54 */     for (String str : this.a.values()) {
/*  55 */       int k = str.length();
/*  56 */       j += k;
/*     */       
/*  58 */       for (int m = 0; m < k; m++) {
/*  59 */         if (str.charAt(m) >= 'Ā') {
/*  60 */           i++;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  65 */     float f = i / j;
/*  66 */     this.d = (f > 0.1D);
/*     */   }
/*     */   
/*     */   private void a(List paramList) {
/*  70 */     for (bqw localbqw : paramList) {
/*  71 */       a(localbqw.b());
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(InputStream paramInputStream) {
/*  76 */     for (String str1 : IOUtils.readLines(paramInputStream, Charsets.UTF_8))
/*     */     {
/*  78 */       if ((!str1.isEmpty()) && (str1.charAt(0) != '#'))
/*     */       {
/*  80 */         String[] arrayOfString = (String[])Iterables.toArray(b.split(str1), String.class);
/*     */         
/*     */ 
/*  83 */         if ((arrayOfString != null) && (arrayOfString.length == 2))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  88 */           String str2 = arrayOfString[0];
/*  89 */           String str3 = c.matcher(arrayOfString[1]).replaceAll("%$1s");
/*     */           
/*  91 */           this.a.put(str2, str3);
/*     */         }
/*     */       } }
/*     */   }
/*     */   
/*  96 */   private String b(String paramString) { String str = (String)this.a.get(paramString);
/*  97 */     return str == null ? paramString : str;
/*     */   }
/*     */   
/*     */   public String a(String paramString, Object[] paramArrayOfObject) {
/* 101 */     String str = b(paramString);
/*     */     try {
/* 103 */       return String.format(str, paramArrayOfObject);
/*     */     } catch (IllegalFormatException localIllegalFormatException) {}
/* 105 */     return "Format error: " + str;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */