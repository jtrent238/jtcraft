/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
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
/*     */ public enum a
/*     */ {
/*     */   private static final Map w;
/*     */   private static final Map x;
/*     */   private static final Pattern y;
/*     */   private final char z;
/*     */   private final boolean A;
/*     */   private final String B;
/*     */   
/*     */   private a(char paramChar)
/*     */   {
/*  40 */     this(paramChar, false);
/*     */   }
/*     */   
/*     */   private a(char paramChar, boolean paramBoolean) {
/*  44 */     this.z = paramChar;
/*  45 */     this.A = paramBoolean;
/*     */     
/*  47 */     this.B = ("§" + paramChar);
/*     */   }
/*     */   
/*     */   static
/*     */   {
/*  31 */     w = new HashMap();
/*  32 */     x = new HashMap();
/*  33 */     y = Pattern.compile("(?i)" + String.valueOf('§') + "[0-9A-FK-OR]");
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
/*  51 */     for (a locala : values()) {
/*  52 */       w.put(Character.valueOf(locala.a()), locala);
/*  53 */       x.put(locala.d(), locala);
/*     */     }
/*     */   }
/*     */   
/*     */   public char a() {
/*  58 */     return this.z;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  62 */     return this.A;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  66 */     return (!this.A) && (this != v);
/*     */   }
/*     */   
/*     */   public String d() {
/*  70 */     return name().toLowerCase();
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/*  75 */     return this.B;
/*     */   }
/*     */   
/*     */   public static String a(String paramString) {
/*  79 */     return paramString == null ? null : y.matcher(paramString).replaceAll("");
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static a b(String paramString)
/*     */   {
/*  87 */     if (paramString == null) return null;
/*  88 */     return (a)x.get(paramString.toLowerCase());
/*     */   }
/*     */   
/*     */   public static Collection a(boolean paramBoolean1, boolean paramBoolean2) {
/*  92 */     ArrayList localArrayList = new ArrayList();
/*     */     
/*  94 */     for (a locala : values()) {
/*  95 */       if (((!locala.c()) || (paramBoolean1)) && (
/*  96 */         (!locala.b()) || (paramBoolean2))) {
/*  97 */         localArrayList.add(locala.d());
/*     */       }
/*     */     }
/* 100 */     return localArrayList;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */