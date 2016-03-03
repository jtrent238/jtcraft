/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bal
/*     */   implements Comparable
/*     */ {
/*  13 */   private static final List a = new ArrayList();
/*  14 */   private static final pz b = new pz();
/*  15 */   private static final Set c = new HashSet();
/*     */   
/*     */   private final String d;
/*     */   private final int e;
/*     */   private final String f;
/*     */   private int g;
/*     */   private boolean h;
/*     */   private int i;
/*     */   
/*     */   public static void a(int paramInt)
/*     */   {
/*  26 */     if (paramInt == 0) return;
/*  27 */     bal localbal = (bal)b.a(paramInt);
/*  28 */     if (localbal != null) localbal.i += 1;
/*     */   }
/*     */   
/*     */   public static void a(int paramInt, boolean paramBoolean) {
/*  32 */     if (paramInt == 0) return;
/*  33 */     bal localbal = (bal)b.a(paramInt);
/*  34 */     if (localbal != null) localbal.h = paramBoolean;
/*     */   }
/*     */   
/*     */   public static void a() {
/*  38 */     for (bal localbal : a) {
/*  39 */       localbal.j();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void b() {
/*  44 */     b.c();
/*  45 */     for (bal localbal : a) {
/*  46 */       b.a(localbal.g, localbal);
/*     */     }
/*     */   }
/*     */   
/*     */   public static Set c() {
/*  51 */     return c;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public bal(String paramString1, int paramInt, String paramString2)
/*     */   {
/*  62 */     this.d = paramString1;
/*  63 */     this.g = paramInt;
/*  64 */     this.e = paramInt;
/*  65 */     this.f = paramString2;
/*     */     
/*  67 */     a.add(this);
/*  68 */     b.a(paramInt, this);
/*  69 */     c.add(paramString2);
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  73 */     return this.h;
/*     */   }
/*     */   
/*     */   public String e() {
/*  77 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  81 */     if (this.i == 0) return false;
/*  82 */     this.i -= 1;
/*  83 */     return true;
/*     */   }
/*     */   
/*     */   private void j() {
/*  87 */     this.i = 0;
/*  88 */     this.h = false;
/*     */   }
/*     */   
/*     */   public String g() {
/*  92 */     return this.d;
/*     */   }
/*     */   
/*     */   public int h() {
/*  96 */     return this.e;
/*     */   }
/*     */   
/*     */   public int i() {
/* 100 */     return this.g;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 104 */     this.g = paramInt;
/*     */   }
/*     */   
/*     */   public int a(bal parambal)
/*     */   {
/* 109 */     int j = brp.a(this.f, new Object[0]).compareTo(brp.a(parambal.f, new Object[0]));
/*     */     
/* 111 */     if (j == 0) {
/* 112 */       j = brp.a(this.d, new Object[0]).compareTo(brp.a(parambal.d, new Object[0]));
/*     */     }
/*     */     
/* 115 */     return j;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */