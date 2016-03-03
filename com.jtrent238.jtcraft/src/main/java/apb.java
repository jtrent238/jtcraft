/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class apb
/*     */   extends aor
/*     */   implements rb
/*     */ {
/*  12 */   private add[] i = new add[9];
/*  13 */   private Random j = new Random();
/*     */   protected String a;
/*     */   
/*     */   public int a()
/*     */   {
/*  18 */     return 9;
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/*  23 */     return this.i[paramInt];
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/*  28 */     if (this.i[paramInt1] != null) {
/*  29 */       if (this.i[paramInt1].b <= paramInt2) {
/*  30 */         localadd = this.i[paramInt1];
/*  31 */         this.i[paramInt1] = null;
/*  32 */         e();
/*  33 */         return localadd;
/*     */       }
/*  35 */       add localadd = this.i[paramInt1].a(paramInt2);
/*  36 */       if (this.i[paramInt1].b == 0) this.i[paramInt1] = null;
/*  37 */       e();
/*  38 */       return localadd;
/*     */     }
/*     */     
/*  41 */     return null;
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/*  46 */     if (this.i[paramInt] != null) {
/*  47 */       add localadd = this.i[paramInt];
/*  48 */       this.i[paramInt] = null;
/*  49 */       return localadd;
/*     */     }
/*  51 */     return null;
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
/*     */   public int i()
/*     */   {
/*  71 */     int k = -1;
/*  72 */     int m = 1;
/*     */     
/*  74 */     for (int n = 0; n < this.i.length; n++) {
/*  75 */       if ((this.i[n] != null) && (this.j.nextInt(m++) == 0)) {
/*  76 */         k = n;
/*     */       }
/*     */     }
/*     */     
/*  80 */     return k;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/*  85 */     this.i[paramInt] = paramadd;
/*  86 */     if ((paramadd != null) && (paramadd.b > d())) paramadd.b = d();
/*  87 */     e();
/*     */   }
/*     */   
/*     */   public int a(add paramadd) {
/*  91 */     for (int k = 0; k < this.i.length; k++) {
/*  92 */       if ((this.i[k] == null) || (this.i[k].b() == null)) {
/*  93 */         a(k, paramadd);
/*  94 */         return k;
/*     */       }
/*     */     }
/*     */     
/*  98 */     return -1;
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 103 */     return k_() ? this.a : "container.dispenser";
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 107 */     this.a = paramString;
/*     */   }
/*     */   
/*     */   public boolean k_()
/*     */   {
/* 112 */     return this.a != null;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(dh paramdh)
/*     */   {
/* 118 */     super.a(paramdh);
/* 119 */     dq localdq = paramdh.c("Items", 10);
/* 120 */     this.i = new add[a()];
/* 121 */     for (int k = 0; k < localdq.c(); k++) {
/* 122 */       dh localdh = localdq.b(k);
/* 123 */       int m = localdh.d("Slot") & 0xFF;
/* 124 */       if ((m >= 0) && (m < this.i.length)) this.i[m] = add.a(localdh);
/*     */     }
/* 126 */     if (paramdh.b("CustomName", 8)) this.a = paramdh.j("CustomName");
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 131 */     super.b(paramdh);
/* 132 */     dq localdq = new dq();
/*     */     
/* 134 */     for (int k = 0; k < this.i.length; k++) {
/* 135 */       if (this.i[k] != null) {
/* 136 */         dh localdh = new dh();
/* 137 */         localdh.a("Slot", (byte)k);
/* 138 */         this.i[k].b(localdh);
/* 139 */         localdq.a(localdh);
/*     */       }
/*     */     }
/* 142 */     paramdh.a("Items", localdq);
/* 143 */     if (k_()) paramdh.a("CustomName", this.a);
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/* 148 */     return 64;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 153 */     if (this.b.o(this.c, this.d, this.e) != this) return false;
/* 154 */     if (paramyz.e(this.c + 0.5D, this.d + 0.5D, this.e + 0.5D) > 64.0D) return false;
/* 155 */     return true;
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
/* 168 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */