
def product = ec.entity.makeValue("moqui.tutorial.TestProduct")
product.setFields(context,true,null,null)
if (!product.productId) product.setSequencedIdPrimary()
product.create()