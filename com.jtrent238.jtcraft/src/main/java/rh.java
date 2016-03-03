/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ public class rh
/*     */   implements rb
/*     */ {
/*     */   private String a;
/*     */   private int b;
/*     */   private add[] c;
/*     */   private List d;
/*     */   private boolean e;
/*     */   
/*     */   public rh(String paramString, boolean paramBoolean, int paramInt)
/*     */   {
/*  16 */     this.a = paramString;
/*  17 */     this.e = paramBoolean;
/*  18 */     this.b = paramInt;
/*  19 */     this.c = new add[paramInt];
/*     */   }
/*     */   
/*     */   public void a(rc paramrc) {
/*  23 */     if (this.d == null) this.d = new ArrayList();
/*  24 */     this.d.add(paramrc);
/*     */   }
/*     */   
/*     */   public void b(rc paramrc) {
/*  28 */     this.d.remove(paramrc);
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/*  33 */     if ((paramInt < 0) || (paramInt >= this.c.length)) {
/*  34 */       return null;
/*     */     }
/*  36 */     return this.c[paramInt];
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     if (this.c[paramInt1] != null) {
/*  42 */       if (this.c[paramInt1].b <= paramInt2) {
/*  43 */         localadd = this.c[paramInt1];
/*  44 */         this.c[paramInt1] = null;
/*  45 */         e();
/*  46 */         return localadd;
/*     */       }
/*  48 */       add localadd = this.c[paramInt1].a(paramInt2);
/*  49 */       if (this.c[paramInt1].b == 0) this.c[paramInt1] = null;
/*  50 */       e();
/*  51 */       return localadd;
/*     */     }
/*     */     
/*  54 */     return null;
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/*  59 */     if (this.c[paramInt] != null) {
/*  60 */       add localadd = this.c[paramInt];
/*  61 */       this.c[paramInt] = null;
/*  62 */       return localadd;
/*     */     }
/*  64 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/*  69 */     this.c[paramInt] = paramadd;
/*  70 */     if ((paramadd != null) && (paramadd.b > d())) paramadd.b = d();
/*  71 */     e();
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  76 */     return this.b;
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/*  81 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean k_()
/*     */   {
/*  86 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*  90 */     this.e = true;
/*  91 */     this.a = paramString;
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/*  96 */     return 64;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 101 */     if (this.d != null) {
/* 102 */       for (int i = 0; i < this.d.size(); i++) {
/* 103 */         ((rc)this.d.get(i)).a(this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 110 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void f() {}
/*     */   
/*     */ 
/*     */   public void l_() {}
/*     */   
/*     */ 
/*     */   public boolean b(int paramInt, add paramadd)
/*     */   {
/* 123 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\rh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */