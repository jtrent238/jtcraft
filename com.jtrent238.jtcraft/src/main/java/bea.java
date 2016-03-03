/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Set;
/*    */ import java.util.TreeMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bea
/*    */   extends bdw
/*    */ {
/*    */   private final bdw a;
/*    */   private final bbj f;
/* 16 */   private final List g = new ArrayList();
/* 17 */   private final List h = new ArrayList();
/*    */   private String i;
/*    */   private String[] r;
/*    */   private beb s;
/*    */   private bcb t;
/*    */   
/*    */   public bea(bdw parambdw, bbj parambbj) {
/* 24 */     this.a = parambdw;
/* 25 */     this.f = parambbj;
/*    */   }
/*    */   
/*    */   public void b()
/*    */   {
/* 30 */     this.i = brp.a("options.snooper.title", new Object[0]);
/* 31 */     String str = brp.a("options.snooper.desc", new Object[0]);
/* 32 */     ArrayList localArrayList = new ArrayList();
/*    */     
/* 34 */     for (Iterator localIterator = this.q.c(str, this.l - 30).iterator(); localIterator.hasNext();) { localObject = (String)localIterator.next();
/* 35 */       localArrayList.add(localObject);
/*    */     }
/*    */     
/* 38 */     this.r = ((String[])localArrayList.toArray(new String[0]));
/*    */     
/* 40 */     this.g.clear();
/* 41 */     this.h.clear();
/*    */     
/* 43 */     this.n.add(this.t = new bcb(1, this.l / 2 - 152, this.m - 30, 150, 20, this.f.c(bbm.w)));
/* 44 */     this.n.add(new bcb(2, this.l / 2 + 2, this.m - 30, 150, 20, brp.a("gui.done", new Object[0])));
/*    */     
/* 46 */     int j = (this.k.H() != null) && (this.k.H().an() != null) ? 1 : 0;
/*    */     
/* 48 */     for (Object localObject = new TreeMap(this.k.J().c()).entrySet().iterator(); ((Iterator)localObject).hasNext();) { localEntry = (Map.Entry)((Iterator)localObject).next();
/* 49 */       this.g.add((j != 0 ? "C " : "") + (String)localEntry.getKey());
/* 50 */       this.h.add(this.q.a((String)localEntry.getValue(), this.l - 220));
/*    */     }
/*    */     Map.Entry localEntry;
/* 53 */     if (j != 0) {
/* 54 */       for (localObject = new TreeMap(this.k.H().an().c()).entrySet().iterator(); ((Iterator)localObject).hasNext();) { localEntry = (Map.Entry)((Iterator)localObject).next();
/* 55 */         this.g.add("S " + (String)localEntry.getKey());
/* 56 */         this.h.add(this.q.a((String)localEntry.getValue(), this.l - 220));
/*    */       }
/*    */     }
/*    */     
/* 60 */     this.s = new beb(this);
/*    */   }
/*    */   
/*    */   protected void a(bcb parambcb)
/*    */   {
/* 65 */     if (!parambcb.l) { return;
/*    */     }
/* 67 */     if (parambcb.k == 2) {
/* 68 */       this.f.b();
/* 69 */       this.f.b();
/* 70 */       this.k.a(this.a);
/*    */     }
/*    */     
/* 73 */     if (parambcb.k == 1) {
/* 74 */       this.f.a(bbm.w, 1);
/* 75 */       this.t.j = this.f.c(bbm.w);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 81 */     c();
/*    */     
/* 83 */     this.s.a(paramInt1, paramInt2, paramFloat);
/* 84 */     a(this.q, this.i, this.l / 2, 8, 16777215);
/*    */     
/* 86 */     int j = 22;
/* 87 */     for (String str : this.r) {
/* 88 */       a(this.q, str, this.l / 2, j, 8421504);
/* 89 */       j += this.q.a;
/*    */     }
/*    */     
/* 92 */     super.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */