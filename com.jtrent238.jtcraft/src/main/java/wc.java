/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wc
/*     */   extends ayl
/*     */ {
/*     */   private ahb a;
/*  17 */   private final List b = new ArrayList();
/*  18 */   private final List c = new ArrayList();
/*  19 */   private final List d = new ArrayList();
/*     */   private int e;
/*     */   
/*     */   public wc(String paramString) {
/*  23 */     super(paramString);
/*     */   }
/*     */   
/*     */   public wc(ahb paramahb) {
/*  27 */     super("villages");
/*  28 */     this.a = paramahb;
/*  29 */     c();
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb) {
/*  33 */     this.a = paramahb;
/*     */     
/*  35 */     for (vz localvz : this.d) {
/*  36 */       localvz.a(paramahb);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/*  41 */     if (this.b.size() > 64) return;
/*  42 */     if (!d(paramInt1, paramInt2, paramInt3)) this.b.add(new r(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void a() {
/*  46 */     this.e += 1;
/*  47 */     for (vz localvz : this.d)
/*  48 */       localvz.a(this.e);
/*  49 */     e();
/*  50 */     f();
/*  51 */     g();
/*     */     
/*  53 */     if (this.e % 400 == 0) {
/*  54 */       c();
/*     */     }
/*     */   }
/*     */   
/*     */   private void e() {
/*  59 */     for (Iterator localIterator = this.d.iterator(); localIterator.hasNext();) {
/*  60 */       vz localvz = (vz)localIterator.next();
/*  61 */       if (localvz.g()) {
/*  62 */         localIterator.remove();
/*  63 */         c();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public List b() {
/*  69 */     return this.d;
/*     */   }
/*     */   
/*     */   public vz a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  73 */     Object localObject = null;
/*  74 */     float f1 = Float.MAX_VALUE;
/*  75 */     for (vz localvz : this.d)
/*     */     {
/*  77 */       float f2 = localvz.a().e(paramInt1, paramInt2, paramInt3);
/*  78 */       if (f2 < f1)
/*     */       {
/*  80 */         float f3 = paramInt4 + localvz.b();
/*  81 */         if (f2 <= f3 * f3)
/*     */         {
/*  83 */           localObject = localvz;
/*  84 */           f1 = f2;
/*     */         } } }
/*  86 */     return (vz)localObject;
/*     */   }
/*     */   
/*     */   private void f() {
/*  90 */     if (this.b.isEmpty()) return;
/*  91 */     a((r)this.b.remove(0));
/*     */   }
/*     */   
/*     */   private void g()
/*     */   {
/*  96 */     for (int i = 0; i < this.c.size(); i++) {
/*  97 */       vy localvy = (vy)this.c.get(i);
/*  98 */       int j = 0;
/*  99 */       for (Object localObject = this.d.iterator(); ((Iterator)localObject).hasNext();) { vz localvz = (vz)((Iterator)localObject).next();
/* 100 */         int k = (int)localvz.a().e(localvy.a, localvy.b, localvy.c);
/* 101 */         int m = 32 + localvz.b();
/* 102 */         if (k <= m * m) {
/* 103 */           localvz.a(localvy);
/* 104 */           j = 1;
/*     */         }
/*     */       }
/* 107 */       if (j == 0)
/*     */       {
/*     */ 
/* 110 */         localObject = new vz(this.a);
/* 111 */         ((vz)localObject).a(localvy);
/* 112 */         this.d.add(localObject);
/* 113 */         c();
/*     */       } }
/* 115 */     this.c.clear();
/*     */   }
/*     */   
/*     */   private void a(r paramr) {
/* 119 */     int i = 16;int j = 4;int k = 16;
/* 120 */     for (int m = paramr.a - i; m < paramr.a + i; m++) {
/* 121 */       for (int n = paramr.b - j; n < paramr.b + j; n++) {
/* 122 */         for (int i1 = paramr.c - k; i1 < paramr.c + k; i1++)
/* 123 */           if (e(m, n, i1))
/*     */           {
/* 125 */             vy localvy = b(m, n, i1);
/* 126 */             if (localvy == null) c(m, n, i1); else
/* 127 */               localvy.f = this.e;
/*     */           }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private vy b(int paramInt1, int paramInt2, int paramInt3) {
/*     */     Object localObject;
/* 135 */     for (Iterator localIterator = this.c.iterator(); localIterator.hasNext(); 
/* 136 */         return localObject)
/*     */     {
/* 135 */       localObject = (vy)localIterator.next();
/* 136 */       if ((((vy)localObject).a != paramInt1) || (((vy)localObject).c != paramInt3) || (Math.abs(((vy)localObject).b - paramInt2) > 1)) {} }
/* 137 */     for (localIterator = this.d.iterator(); localIterator.hasNext();) { localObject = (vz)localIterator.next();
/* 138 */       vy localvy = ((vz)localObject).e(paramInt1, paramInt2, paramInt3);
/* 139 */       if (localvy != null) return localvy;
/*     */     }
/* 141 */     return null;
/*     */   }
/*     */   
/*     */   private void c(int paramInt1, int paramInt2, int paramInt3) {
/* 145 */     int i = ((akn)ajn.ao).e(this.a, paramInt1, paramInt2, paramInt3);
/* 146 */     int j; int k; if ((i == 0) || (i == 2)) {
/* 147 */       j = 0;
/* 148 */       for (k = -5; k < 0; k++)
/* 149 */         if (this.a.i(paramInt1 + k, paramInt2, paramInt3)) j--;
/* 150 */       for (k = 1; k <= 5; k++)
/* 151 */         if (this.a.i(paramInt1 + k, paramInt2, paramInt3)) j++;
/* 152 */       if (j != 0) this.c.add(new vy(paramInt1, paramInt2, paramInt3, j > 0 ? -2 : 2, 0, this.e));
/*     */     } else {
/* 154 */       j = 0;
/* 155 */       for (k = -5; k < 0; k++)
/* 156 */         if (this.a.i(paramInt1, paramInt2, paramInt3 + k)) j--;
/* 157 */       for (k = 1; k <= 5; k++)
/* 158 */         if (this.a.i(paramInt1, paramInt2, paramInt3 + k)) j++;
/* 159 */       if (j != 0) this.c.add(new vy(paramInt1, paramInt2, paramInt3, 0, j > 0 ? -2 : 2, this.e));
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean d(int paramInt1, int paramInt2, int paramInt3) {
/* 164 */     for (Iterator localIterator = this.b.iterator(); localIterator.hasNext(); 
/* 165 */         return true)
/*     */     {
/* 164 */       r localr = (r)localIterator.next();
/* 165 */       if ((localr.a != paramInt1) || (localr.b != paramInt2) || (localr.c != paramInt3)) {} }
/* 166 */     return false;
/*     */   }
/*     */   
/*     */   private boolean e(int paramInt1, int paramInt2, int paramInt3) {
/* 170 */     return this.a.a(paramInt1, paramInt2, paramInt3) == ajn.ao;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(dh paramdh)
/*     */   {
/* 176 */     this.e = paramdh.f("Tick");
/*     */     
/* 178 */     dq localdq = paramdh.c("Villages", 10);
/* 179 */     for (int i = 0; i < localdq.c(); i++) {
/* 180 */       dh localdh = localdq.b(i);
/* 181 */       vz localvz = new vz();
/* 182 */       localvz.a(localdh);
/* 183 */       this.d.add(localvz);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void b(dh paramdh)
/*     */   {
/* 190 */     paramdh.a("Tick", this.e);
/* 191 */     dq localdq = new dq();
/* 192 */     for (vz localvz : this.d) {
/* 193 */       dh localdh = new dh();
/* 194 */       localvz.b(localdh);
/* 195 */       localdq.a(localdh);
/*     */     }
/* 197 */     paramdh.a("Villages", localdq);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */