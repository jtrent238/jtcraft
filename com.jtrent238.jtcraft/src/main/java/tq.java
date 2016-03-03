/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Collection;
/*    */ import java.util.HashSet;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class tq
/*    */   extends tl
/*    */ {
/* 11 */   private final Set d = Sets.newHashSet();
/* 12 */   protected final Map c = new py();
/*    */   
/*    */   public tn c(th paramth)
/*    */   {
/* 16 */     return (tn)super.a(paramth);
/*    */   }
/*    */   
/*    */   public tn b(String paramString)
/*    */   {
/* 21 */     ti localti = super.a(paramString);
/* 22 */     if (localti == null) localti = (ti)this.c.get(paramString);
/* 23 */     return (tn)localti;
/*    */   }
/*    */   
/*    */   public ti b(th paramth)
/*    */   {
/* 28 */     if (this.b.containsKey(paramth.a())) { throw new IllegalArgumentException("Attribute is already registered!");
/*    */     }
/* 30 */     tn localtn = new tn(this, paramth);
/* 31 */     this.b.put(paramth.a(), localtn);
/* 32 */     if (((paramth instanceof to)) && (((to)paramth).f() != null)) {
/* 33 */       this.c.put(((to)paramth).f(), localtn);
/*    */     }
/* 35 */     this.a.put(paramth, localtn);
/*    */     
/* 37 */     return localtn;
/*    */   }
/*    */   
/*    */   public void a(tn paramtn)
/*    */   {
/* 42 */     if (paramtn.a().c()) {
/* 43 */       this.d.add(paramtn);
/*    */     }
/*    */   }
/*    */   
/*    */   public Set b() {
/* 48 */     return this.d;
/*    */   }
/*    */   
/*    */   public Collection c() {
/* 52 */     HashSet localHashSet = Sets.newHashSet();
/*    */     
/* 54 */     for (ti localti : a()) {
/* 55 */       if (localti.a().c()) {
/* 56 */         localHashSet.add(localti);
/*    */       }
/*    */     }
/*    */     
/* 60 */     return localHashSet;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */