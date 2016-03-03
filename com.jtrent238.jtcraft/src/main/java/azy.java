/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class azy
/*     */   extends bae
/*     */ {
/*     */   private final bac a;
/*     */   private final String b;
/*  16 */   private final Set c = new HashSet();
/*     */   private String d;
/*  18 */   private String e = "";
/*  19 */   private String f = "";
/*  20 */   private boolean g = true;
/*  21 */   private boolean h = true;
/*     */   
/*     */   public azy(bac parambac, String paramString) {
/*  24 */     this.a = parambac;
/*  25 */     this.b = paramString;
/*  26 */     this.d = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String b()
/*     */   {
/*  35 */     return this.b;
/*     */   }
/*     */   
/*     */   public String c() {
/*  39 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*  43 */     if (paramString == null) throw new IllegalArgumentException("Name cannot be null");
/*  44 */     this.d = paramString;
/*  45 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public Collection d() {
/*  49 */     return this.c;
/*     */   }
/*     */   
/*     */   public String e() {
/*  53 */     return this.e;
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/*  57 */     if (paramString == null) throw new IllegalArgumentException("Prefix cannot be null");
/*  58 */     this.e = paramString;
/*  59 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public String f() {
/*  63 */     return this.f;
/*     */   }
/*     */   
/*     */   public void c(String paramString) {
/*  67 */     if (paramString == null) throw new IllegalArgumentException("Suffix cannot be null");
/*  68 */     this.f = paramString;
/*  69 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public String d(String paramString)
/*     */   {
/*  74 */     return e() + paramString + f();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String a(bae parambae, String paramString)
/*     */   {
/*  82 */     if (parambae == null) return paramString;
/*  83 */     return parambae.d(paramString);
/*     */   }
/*     */   
/*     */   public boolean g()
/*     */   {
/*  88 */     return this.g;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/*  92 */     this.g = paramBoolean;
/*  93 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public boolean h()
/*     */   {
/*  98 */     return this.h;
/*     */   }
/*     */   
/*     */   public void b(boolean paramBoolean) {
/* 102 */     this.h = paramBoolean;
/* 103 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public int i() {
/* 107 */     int i = 0;
/*     */     
/* 109 */     if (g()) i |= 0x1;
/* 110 */     if (h()) { i |= 0x2;
/*     */     }
/* 112 */     return i;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 116 */     a((paramInt & 0x1) > 0);
/* 117 */     b((paramInt & 0x2) > 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\azy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */