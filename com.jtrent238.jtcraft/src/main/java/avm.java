/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class avm
/*     */ {
/*  10 */   protected LinkedList a = new LinkedList();
/*     */   
/*     */   protected asv b;
/*     */   private int c;
/*     */   private int d;
/*     */   
/*     */   public avm() {}
/*     */   
/*     */   public avm(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     this.c = paramInt1;
/*  21 */     this.d = paramInt2;
/*     */   }
/*     */   
/*     */   public asv a() {
/*  25 */     return this.b;
/*     */   }
/*     */   
/*     */   public LinkedList b() {
/*  29 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, Random paramRandom, asv paramasv) {
/*  33 */     Iterator localIterator = this.a.iterator();
/*  34 */     while (localIterator.hasNext()) {
/*  35 */       avk localavk = (avk)localIterator.next();
/*  36 */       if ((localavk.c().a(paramasv)) && 
/*  37 */         (!localavk.a(paramahb, paramRandom, paramasv))) {
/*  38 */         localIterator.remove();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  45 */     this.b = asv.a();
/*     */     
/*  47 */     for (avk localavk : this.a) {
/*  48 */       this.b.b(localavk.c());
/*     */     }
/*     */   }
/*     */   
/*     */   public dh a(int paramInt1, int paramInt2) {
/*  53 */     dh localdh = new dh();
/*     */     
/*  55 */     localdh.a("id", avi.a(this));
/*  56 */     localdh.a("ChunkX", paramInt1);
/*  57 */     localdh.a("ChunkZ", paramInt2);
/*  58 */     localdh.a("BB", this.b.h());
/*     */     
/*  60 */     dq localdq = new dq();
/*  61 */     for (avk localavk : this.a) {
/*  62 */       localdq.a(localavk.b());
/*     */     }
/*  64 */     localdh.a("Children", localdq);
/*     */     
/*  66 */     a(localdh);
/*     */     
/*  68 */     return localdh;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(dh paramdh) {}
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, dh paramdh)
/*     */   {
/*  77 */     this.c = paramdh.f("ChunkX");
/*  78 */     this.d = paramdh.f("ChunkZ");
/*  79 */     if (paramdh.c("BB")) {
/*  80 */       this.b = new asv(paramdh.l("BB"));
/*     */     }
/*     */     
/*  83 */     dq localdq = paramdh.c("Children", 10);
/*  84 */     for (int i = 0; i < localdq.c(); i++) {
/*  85 */       this.a.add(avi.b(localdq.b(i), paramahb));
/*     */     }
/*     */     
/*  88 */     b(paramdh);
/*     */   }
/*     */   
/*     */ 
/*     */   public void b(dh paramdh) {}
/*     */   
/*     */   protected void a(ahb paramahb, Random paramRandom, int paramInt)
/*     */   {
/*  96 */     int i = 63 - paramInt;
/*     */     
/*     */ 
/*  99 */     int j = this.b.c() + 1;
/*     */     
/* 101 */     if (j < i) {
/* 102 */       j += paramRandom.nextInt(i - j);
/*     */     }
/*     */     
/*     */ 
/* 106 */     int k = j - this.b.e;
/* 107 */     this.b.a(0, k, 0);
/* 108 */     for (avk localavk : this.a) {
/* 109 */       localavk.c().a(0, k, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*     */   {
/* 115 */     int i = paramInt2 - paramInt1 + 1 - this.b.c();
/* 116 */     int j = 1;
/*     */     
/* 118 */     if (i > 1) {
/* 119 */       j = paramInt1 + paramRandom.nextInt(i);
/*     */     } else {
/* 121 */       j = paramInt1;
/*     */     }
/*     */     
/*     */ 
/* 125 */     int k = j - this.b.b;
/* 126 */     this.b.a(0, k, 0);
/* 127 */     for (avk localavk : this.a) {
/* 128 */       localavk.c().a(0, k, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 133 */     return true;
/*     */   }
/*     */   
/*     */   public int e() {
/* 137 */     return this.c;
/*     */   }
/*     */   
/*     */   public int f() {
/* 141 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\avm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */